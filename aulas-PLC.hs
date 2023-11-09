-- AULA 1 -----------------------------------------------------------------------------------------------------------
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
            | otherwise = max (maxVendas (n-1)) (vendas n)

totalVendas :: Int -> Int
totalVendas n | n == 0 = vendas 0
              | otherwise = totalVendas (n-1) + vendas n
        
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
