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

addEspacos :: Int -> String
addEspacos 0 = ""
addEspacos n = " " ++ addEspacos (n-1)imprimeTabela n = putStr ("Semana    Venda\n" ++ imprimeSemana n ++ "\n" ++ imprimeTotal n ++ imprimeMedia n)

imprimeTotal :: Int -> String
imprimeTotal n = "Total: " ++ show (totalVendas n) ++ "\n"

imprimeMedia :: Int -> String
imprimeMedia n = "Media: " ++ show (fromIntegral (totalVendas n) / fromIntegral (n+1)) ++ "\n"

imprimeTabela :: Int -> IO()
imprimeTabela n = putStr ("Semana    Venda\n" ++ imprimeSemana n ++ "\n" ++ imprimeTotal n ++ imprimeMedia n)

