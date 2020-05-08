-- |

module Parsers2 where

import Text.Parsec

ignoreBraces :: Parsec [Char] u a -> Parsec [Char] u b -> Parsec [Char] u c -> Parsec [Char] u c
ignoreBraces p1 p2 p3 = p1 *> p3 <* p2
