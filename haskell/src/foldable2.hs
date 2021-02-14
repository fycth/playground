{-# LANGUAGE TypeOperators #-}

module Foldable2 where

data Tree a = Nil | Branch (Tree a) a (Tree a) deriving (Eq, Show)

newtype Preorder a   = PreO   (Tree a)    deriving (Eq, Show)
newtype Postorder a  = PostO  (Tree a)    deriving (Eq, Show)
newtype Levelorder a = LevelO (Tree a)    deriving (Eq, Show)

instance Foldable Tree where
  foldr f ini Nil = ini
  foldr f ini (Branch l x r) = foldr f (f x (foldr f ini r)) l

instance Foldable Preorder where
  foldr f ini (PreO Nil) = ini
  foldr f ini (PreO (Branch l x r)) = f x (foldr f (foldr f ini (PreO r)) (PreO l))

instance Foldable Postorder where
  foldr f ini (PostO Nil) = ini
  foldr f ini (PostO (Branch l x r)) = foldr f (foldr f (f x ini) (PostO r)) (PostO l)

instance Foldable Levelorder where
  foldr f ini (LevelO Nil) = ini
  foldr f ini (LevelO t) = foldr f ini $ levels [] t []
    where
      levels :: [Tree a] -> Tree a -> [a] -> [a]
      levels _ Nil acc = acc
      levels queue (Branch l x r) acc =
        levels newq newroot newacc
        where
          newacc = acc ++ [x]
          ql = case l of Nil -> queue; _ -> queue ++ [l]
          qr = case r of Nil -> ql; _ -> ql ++ [r]
          (newq, newroot) = if null qr then ([], Nil) else (tail qr, head qr)
