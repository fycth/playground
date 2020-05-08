-- |

module Parsers7 where

import Control.Applicative

newtype Prs a = Prs { runPrs :: String -> Maybe (a, String) }

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
  fmap f p = Prs fun where
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
  pf <*> pv = Prs fun where
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
satisfy f = Prs fun where
  fun :: String -> Maybe (Char, String)
  fun [] = Nothing
  fun (c:ss) = case f c of
    False -> Nothing
    True -> Just (c, ss)

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
  empty = Prs fun where fun s = Nothing
  f <|> g = Prs fun where
    fun s =
      let fs = runPrs f s
      in if null fs then runPrs g s else fs

many1 :: Prs a -> Prs [a]
many1 p = (:) <$> p <*> many p

{-
> runPrs (many1 $ char 'A') "AAABCDE"
Just ("AAA","BCDE")
> runPrs (many1 $ char 'A') "BCDE"
Nothing
-}
