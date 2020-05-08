
-- |

module Parsers5 where

--import Text.Parsec
--import Text.ParserCombinators.Parsec.Error

newtype PrsE a = PrsE { runPrsE :: String -> Either String (a, String) }

{-
GHCi> runPrs anyChr "ABC"
Just ('A',"BC")
GHCi> runPrs anyChr ""
Nothing
GHCi> runPrs (digitToInt <$> anyChr) "BCD"
Just (11,"CD")
-}

instance Functor PrsE where
  -- (a -> b) -> Prs a -> Prs b
  fmap f p = PrsE fun where
    fun s =
      case runPrsE p s of
        Left err -> Left err
        Right (b, s') -> Right (f b, s')

{-
GHCi> runPrs ((,,) <$> anyChr <*> anyChr <*> anyChr) "ABCDE"
Just (('A','B','C'),"DE")
GHCi> runPrs (anyChr *> anyChr) "ABCDE"
Just ('B',"CDE")
-}


{-
GHCi> let anyE = satisfyE (const True)
GHCi> runPrsE ((,) <$> anyE <* charE 'B' <*> anyE) "ABCDE"
Right (('A','C'),"DE")
GHCi> runPrsE ((,) <$> anyE <* charE 'C' <*> anyE) "ABCDE"
Left "unexpected B"
GHCi> runPrsE ((,) <$> anyE <* charE 'B' <*> anyE) "AB"
Left "unexpected end of input"
-}

instance Applicative PrsE where
  pure a = PrsE fun where fun s = Right (a, s)
  -- Prs (a -> b) -> Prs a -> Prs b
  pf <*> pv = PrsE fun where
    fun s =
      case runPrsE pf s of
        Left err -> Left err
        Right (g, s') ->
          case runPrsE pv s' of
            Left err -> Left err
            Right (a, s'') -> Right (g a, s'')

charE :: Char -> PrsE Char
charE c = satisfyE (== c)

satisfyE :: (Char -> Bool) -> PrsE Char
satisfyE f = PrsE fun where
  fun :: String -> Either String (Char, String)
  fun [] = Left "unexpected end of input"
  fun (c:ss) = case f c of
    False -> Left $ "unexpected " ++ [c]
    True -> Right (c, ss)

-- GHCi> runPrs anyChr "ABC"
-- Just ('A',"BC")
