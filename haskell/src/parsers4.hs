-- |

module Parsers4 where

import Text.Parsec

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

anyChr :: Prs Char
anyChr = Prs fun where
  fun :: String -> Maybe (Char, String)
  fun s = case parse ((,) <$> anyChar <*> manyTill anyToken eof) "" s of
    Left _ -> Nothing
    Right x -> Just x

-- GHCi> runPrs anyChr "ABC"
-- Just ('A',"BC")
