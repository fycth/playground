{-# LANGUAGE TypeOperators #-}

module Traversable4 where

import Data.Foldable()

data Tree a = Nil | Branch (Tree a) a (Tree a) deriving (Eq, Show)

instance Foldable Tree where
  foldr _ ini Nil = ini
  foldr f ini (Branch l x r) = f x (foldr f (foldr f ini r) l)

instance Functor Tree where
  fmap _ Nil = Nil
  fmap f (Branch l x r) = Branch (fmap f l) (f x) (fmap f r) 

instance Applicative Tree where
  (Branch g f m) <*> (Branch x y z) = Branch (g <*> x) (f y) (m <*> z)
  Branch {} <*> Nil = Nil
  Nil <*> Branch {} = Nil
  pure x = Branch Nil x Nil

instance Traversable Tree where
  traverse f (Branch l x r) = Branch <$> traverse f l <*> f x <*> traverse f r
  traverse _ Nil = pure Nil
