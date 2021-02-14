{-# LANGUAGE TypeOperators #-}

module Foldable5 where

import Data.Foldable

data Tree a = Nil | Branch (Tree a) a (Tree a) deriving (Eq, Show)

instance Foldable Tree where
  foldr f ini Nil = ini
  foldr f ini (Branch l x r) = f x (foldr f (foldr f ini r) l)

instance Functor Tree where
  fmap f Nil = Nil
  fmap f (Branch l x r) = Branch (fmap f l) (f x) (fmap f r) 

-- GHCi> tree = Branch (Branch Nil 1 Nil) 2 (Branch (Branch Nil 3 Nil) 4 (Branch Nil 5 Nil))
-- GHCi> fst $ sequenceA_ $ (\x -> (show x,x)) <$> tree
-- "21435"