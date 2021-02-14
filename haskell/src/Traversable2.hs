{-# LANGUAGE TypeOperators #-}

module Traversable2 where

import Data.Foldable()

data Triple a = Tr a a a  deriving (Eq,Show)

instance Foldable Triple where
  foldl f ini (Tr l x r) = f (f (f ini l) x) r
  foldr f ini (Tr l x r) = f l (f x (f r ini))

instance Functor Triple where
  fmap g (Tr x y z) = Tr (g x) (g y) (g z)
  
instance Applicative Triple where
  Tr g f m <*> Tr x y z = Tr (g x) (f y) (m z)
  pure x = Tr x x x

instance Traversable Triple where
  traverse f (Tr l x r) = Tr <$> f l <*> f x <*> f r
--  traverse f (Tr l x r) = pure Tr <*> f l <*> f x <*> f r
  
