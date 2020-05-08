-- |
module Parsers8 where

import Control.Applicative

newtype Prs a = Prs {runPrs :: String -> Maybe (a, String)}

{-
GHCi> runPrs anyChr "ABC"
Just ('A',"BC")
GHCi> runPrs anyChr ""
Nothing
GHCi> runPrs (digitToInt <$> anyChr) "BCD"
Just (11,"CD")
-}

instance Functor Prs where
  -- (a -> b) -> Prs a -> Prs b
  fmap f p = Prs fun
    where
      fun s =
        case runPrs p s of
          Nothing -> Nothing
          Just (b, s') -> Just (f b, s')

{-
GHCi> runPrs ((,,) <$> anyChr <*> anyChr <*> anyChr) "ABCDE"
Just (('A','B','C'),"DE")
GHCi> runPrs (anyChr *> anyChr) "ABCDE"
Just ('B',"CDE")
-}

instance Applicative Prs where
  pure a = Prs fun where fun s = Just (a, s)

  -- Prs (a -> b) -> Prs a -> Prs b
  pf <*> pv = Prs fun
    where
      fun s =
        case runPrs pf s of
          Nothing -> Nothing
          Just (g, s') ->
            case runPrs pv s' of
              Nothing -> Nothing
              Just (a, s'') -> Just (g a, s'')

char :: Char -> Prs Char
char c = satisfy (== c)

satisfy :: (Char -> Bool) -> Prs Char
satisfy f = Prs fun
  where
    fun :: String -> Maybe (Char, String)
    fun [] = Nothing
    fun (c : ss) = if f c then Just (c, ss) else Nothing

-- GHCi> runPrs anyChr "ABC"
-- Just ('A',"BC")

{-
GHCi> runPrs (char 'A' <|> char 'B') "ABC"
Just ('A',"BC")
GHCi> runPrs (char 'A' <|> char 'B') "BCD"
Just ('B',"CD")
GHCi> runPrs (char 'A' <|> char 'B') "CDE"
Nothing
-}

instance Alternative Prs where
  empty = Prs fun where fun _ = Nothing
  f <|> g = Prs fun
    where
      fun s =
        let fs = runPrs f s
         in if null fs then runPrs g s else fs

many1 :: Prs a -> Prs [a]
many1 p = (:) <$> p <*> many p

mult :: Prs Int
mult = (*) <$> nat <* char '*' <*> nat

isDigit :: Char -> Bool
isDigit c = case reads [c] :: [(Int, String)] of
  [(_, _)] -> True
  _ -> False

nat :: Prs Int
nat = Prs fun
  where
    fun [] = Nothing
    fun s = case runPrs (many1 $ satisfy isDigit) s of
      Nothing -> Nothing
      Just (s', ss) -> case reads s' :: [(Int, String)] of
        [(i, _)] -> Just (i, ss)
        _ -> Nothing
{-
GHCi> runPrs mult "14*3"
Just (42,"")
GHCi> runPrs mult "64*32"
Just (2048,"")
GHCi> runPrs mult "77*0"
Just (0,"")
GHCi> runPrs mult "2*77AAA"
Just (154,"AAA")
-}
