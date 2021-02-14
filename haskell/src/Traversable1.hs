{-# LANGUAGE TypeOperators #-}

module Traversable1 where

import Data.Foldable()

data Tree a = Nil | Branch (Tree a) a (Tree a) deriving (Eq, Show)

instance Foldable Tree where
  foldr f ini Nil = ini
  foldr f ini (Branch l x r) = f x (foldr f (foldr f ini r) l)

instance Functor Tree where
  fmap f Nil = Nil
  fmap f (Branch l x r) = Branch (fmap f l) (f x) (fmap f r) 

traverse2list :: (Foldable t, Applicative f) => (a -> f b) -> t a -> f [b]
traverse2list func = foldr (\x1 y1 -> ((:) <$> func x1) <*> y1) (pure [])
-- traverse2list func = foldr (\x1 y1 -> pure (:) <*> func x1 <*> y1) (pure [])

-- GHCi> traverse2list (\x -> [x+10,x+20]) [1,2,3]
-- [[11,12,13],[11,12,23],[11,22,13],[11,22,23],[21,12,13],[21,12,23],[21,22,13],[21,22,23]]
-- GHCi> traverse2list (\x -> [x+10,x+20]) $ Branch (Branch Nil 1 Nil) 2 (Branch Nil 3 Nil)
-- [[12,11,13],[12,11,23],[12,21,13],[12,21,23],[22,11,13],[22,11,23],[22,21,13],[22,21,23]]