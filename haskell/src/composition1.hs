{-# LANGUAGE TypeOperators #-}

module Composition1 where

infixr 9 |.|
newtype (|.|) f g a = Cmps { getCmps :: f (g a) }
  deriving (Eq,Show)

type A   = ((,) Integer |.| (,) Char) Bool
type B t = ((,,) Bool (t -> t) |.| Either String) Int
type C   = (|.|) ((->) Bool) ((->) Integer) Integer

a :: A
a = Cmps (1,('c',True))

b :: B t
b = Cmps (True, (\x -> x), Right 1)

c :: C
c = Cmps (\_ _ -> 1)
