-- |

module Parsers3 where

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
  fmap f p = Prs fun where
    fun s =
      case runPrs p s of
        Nothing -> Nothing
        Just (b, s') -> Just (f b, s')

anyChr :: Prs Char
anyChr = Prs fun where
  fun :: String -> Maybe (Char, String)
  fun s = case parse ((,) <$> anyChar <*> manyTill anyToken eof) "" s of
    Left _ -> Nothing
    Right x -> Just x

-- GHCi> runPrs anyChr "ABC"
-- Just ('A',"BC")
