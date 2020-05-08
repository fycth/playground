-- |

module Monoid where

{-
class Semigroup a => Monoid where
  mempty :: a               ; empty element
  mappend :: a -> a -> a    ; binary (associative) operation, redundant, default implementation is <> (= ++ for lists)
  mconcat :: [a] -> a       ; fold a list using monoid

&& - conjunction (All)
|| - disjunction (Any)

isLower :: Char -> Bool
Any . isLower :: Char -> Any
mappend (Any . isLower) (Any . isDigit) :: Char -> Any

fold [ (Any . isLower), (Any . isDigit) ] :: Char -> Any

now is the magic...

fold $ map (Any .) [ isLower, isDigit, isUpper ] :: Char -> Any

now... fold $ map -> foldMap

foldMap (Any .) [ isLower, isDigit, isUpper ] :: Char -> Any

foldMap (All .) [ isLower, isDigit, isUpper ] :: Char -> Any

getAny :: Any -> Bool

-}
