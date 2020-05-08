-- |


module Triple where

import Control.Applicative ((<$>), Applicative(..))

data Triple a = Tr a a a  deriving (Eq,Show)

instance Functor Triple where
  fmap g (Tr x y z) = Tr (g x) (g y) (g z)

instance Applicative Triple where
  Tr g f m <*> Tr x y z = Tr (g x) (f y) (m z)
  pure x = Tr x x x
