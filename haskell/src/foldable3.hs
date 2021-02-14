{-# LANGUAGE TypeOperators #-}

module Foldable3 where

import Data.Monoid

mkEndo :: Foldable t => t (a -> a) -> Endo a
mkEndo t = foldr (\f e -> (Endo f) <> e) mempty t 

