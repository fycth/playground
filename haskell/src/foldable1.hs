{-# LANGUAGE TypeOperators #-}

module Foldable1 where

data Triple a = Tr a a a  deriving (Eq,Show)

instance Foldable Triple where
  foldl f ini (Tr q w e) = f (f (f ini q) w) e
  foldr f ini (Tr q w e) = f q (f w (f e ini))
