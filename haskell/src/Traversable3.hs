{-# LANGUAGE TypeOperators #-}

module Traversable3 where

import Data.Foldable()

data Result a = Ok a | Error String deriving (Eq,Show)

instance Foldable Result where
  foldr f ini (Ok x) = f x ini
  foldr _ ini (Error _) = ini

instance Functor Result where
  fmap g (Ok x) = Ok (g x)
  fmap _ (Error x) = Error x
  
instance Applicative Result where
  Ok g <*> Ok x = Ok (g x)
  _ <*> Error g = Error g
  Error g <*> _ = Error g
  pure = Ok

instance Traversable Result where
  traverse f (Ok x) = Ok <$> f x
  traverse _ (Error x) = pure (Error x)
