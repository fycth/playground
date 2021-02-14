{-# LANGUAGE TypeOperators #-}

module Traversable4 where

import Data.Foldable()

infixr 9 |.|
newtype (|.|) f g a = Cmps { getCmps :: f (g a) }  deriving (Eq,Show) 

instance (Functor f, Functor g) => Functor (f |.| g) where
  fmap h (Cmps x) = Cmps $ fmap (fmap h) x

instance (Applicative f, Applicative g) => Applicative (f |.| g) where
  pure = Cmps . pure . pure
  f <*> x = Cmps $ (<*>) <$> getCmps f <*> getCmps x

instance (Foldable f, Foldable g) => Foldable (f |.| g) where
  foldMap f (Cmps x) = foldMap (foldMap f) x

instance (Traversable g, Traversable f) => Traversable (f |.| g) where
  --traverse f (Cmps x) = pure Cmps <*> traverse (traverse f) x
  traverse f (Cmps x) = Cmps <$> traverse (traverse f) x

  