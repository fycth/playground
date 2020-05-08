-- |
module Applicative3 where

newtype Arr2 e1 e2 a = Arr2 {getArr2 :: e1 -> e2 -> a}

newtype Arr3 e1 e2 e3 a = Arr3 {getArr3 :: e1 -> e2 -> e3 -> a}

instance Functor (Arr2 e1 e2) where
  fmap f (Arr2 g) = Arr2 (\x -> f . g x)

instance Functor (Arr3 e1 e2 e3) where
  fmap f (Arr3 g) = Arr3 (\x y -> f . g x y)

instance Applicative (Arr2 e1 e2) where
  pure f = Arr2 (\x y -> f)
  (<*>) (Arr2 f) (Arr2 g) = Arr2 (\x y -> f x y (g x y))

instance Applicative (Arr3 e1 e2 e3) where
  pure f = Arr3 (\x y z -> f)
  (<*>) (Arr3 f) (Arr3 g) = Arr3 (\x y z -> f x y z (g x y z))
