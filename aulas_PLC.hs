-- AULA 1 -----------------------------------------------------------------------------------------------------------
square :: Int -> Int
square x = x * x

allEqual :: Int -> Int -> Int -> Bool
allEqual n m p = (n == m) && (m == p)

maxi :: Int -> Int -> Int
maxi n m | n >= m = n
         | otherwise = m

vendas :: Int -> Int
vendas 0 = 30
vendas 1 = 50
vendas 2 = 80
vendas 3 = 60
vendas 4 = 50
vendas 5 = 50
vendas 6 = 150
vendas 7 = 50
vendas n = 0

maxVendas :: Int -> Int
maxVendas n | n == 0 = vendas 0
            | otherwise = maxi (maxVendas (n-1)) (vendas n)

totalVendas :: Int -> Int
totalVendas n | n == 0 = vendas 0
              | otherwise = totalVendas (n-1) + vendas n

vendasIgualA :: Int -> Int -> Int
vendasIgualA s 0 | vendas 0 == s = 1
              | otherwise = 0
vendasIgualA s n | vendas n == s = 1 + vendasIgualA s (n-1)
              | otherwise = vendasIgualA s (n-1)

ehPrimo :: Int -> Bool
ehPrimo 2 = True
ehPrimo n = modl n (div n 2 + 1)
    where modl x 2 = mod x 2 == 1
          modl x y | mod x y == 0 = False
                   | otherwise = modl x (y-1)

primosEntreSi :: Int -> Int -> Bool
primosEntreSi x y | x > y = mdc x y == 1
                  | y > x = mdc y x == 1
    where mdc a b | mod a b == 0 = b
                  | otherwise = mdc b (mod a b)

fat :: Int -> Int
fat 0 = 1
fat n = n * fat (n-1)

all4Equal :: Int -> Int -> Int -> Int -> Bool
all4Equal a b c d = a == b && allEqual b c d

equalCount :: Int -> Int -> Int -> Int
equalCount a b c | allEqual a b c = 3
                 | a == b || a == c || b == c = 2
                 | otherwise = 0

-- AULA 2 -------------------------------------------------------------------------------------------------------
addEspacos :: Int -> String
addEspacos 0 = ""
addEspacos n = " " ++ addEspacos (n-1)

imprimeSemana :: Int -> String
imprimeSemana 0 = "  0" ++ addEspacos 8 ++ show (vendas 0)
imprimeSemana n = imprimeSemana (n-1) ++ "\n  " ++ show n ++  addEspacos 8 ++ show (vendas n)

imprimeTotal :: Int -> String
imprimeTotal n = "Total: " ++ show (totalVendas n) ++ "\n"

imprimeMedia :: Int -> String
imprimeMedia n = "Media: " ++ show (fromIntegral (totalVendas n) / fromIntegral (n+1)) ++ "\n"

imprimeTabela :: Int -> IO()
imprimeTabela n = putStr ("Semana    Venda\n" ++ imprimeSemana n ++ "\n" ++ imprimeTotal n ++ imprimeMedia n)

-- AULA 3 -----------------------------------------------------------------------------------------------------------
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

-- AULA 4 -----------------------------------------------------------------------------------------------------------
