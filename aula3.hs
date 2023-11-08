lista1 :: [Int]
lista1 = [1,2,3,4]

lista2 :: String
lista2 = "g2h31gb10jh57"

lista3 :: [(Int,Int)]
lista3 = [(2,3),(4,6),(1,6),(4,7)]

sumList :: [Int] -> Int
sumList [] = 0
sumList (h:t) = h + sumList t

double :: [Int] -> [Int]
double [] = []
double (h:t) = (2*h):(double t)

member :: [Int] -> Int -> Bool
member [] n = False
member (h:t) n | n == h = True
               | otherwise = member t n

digits :: String -> String
digits [] = []
digits (h:t) | h <= '9' && h >= '0' = h:(digits t)
             | otherwise = digits t

sumPairs :: [(Int, Int)] -> [Int]
sumPairs [] = []
sumPairs ((x, y):t) = (x+y):(sumPairs t)