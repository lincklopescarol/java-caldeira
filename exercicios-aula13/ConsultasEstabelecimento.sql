CREATE DATABASE estabelecimento;
USE estabelecimento;

-- LEVEL 1 - CRIANDO AS TABELAS
CREATE TABLE Clientes (
    ID_Cliente INT NOT NULL, 
    Nome VARCHAR(100), 
    Email VARCHAR(100), 
    Telefone VARCHAR(15), 
    PRIMARY KEY(ID_Cliente)
);

CREATE TABLE Produtos (
    ID_Produto INT NOT NULL, 
    Nome VARCHAR(100), 
    Preco DOUBLE, 
    Categoria VARCHAR(100), 
    PRIMARY KEY(ID_Produto)
);

CREATE TABLE Pedidos (
    ID_Pedido INT NOT NULL,
    ID_Cliente INT,
    Data_Pedido DATE,
    Valor_Total DOUBLE,
    PRIMARY KEY(ID_Pedido),
    FOREIGN KEY (ID_Cliente) REFERENCES Clientes(ID_Cliente)
);

CREATE TABLE DetalhesDoPedido (
    ID_Detalhe INT NOT NULL, 
    ID_Pedido INT, 
    ID_Produto INT,
    PRIMARY KEY(ID_Detalhe),
    FOREIGN KEY(ID_Pedido) REFERENCES Pedidos(ID_Pedido),
    FOREIGN KEY(ID_Produto) REFERENCES Produtos(ID_Produto),
    Quantidade INT
);

-- POPULANDO AS TABELAS 
INSERT INTO Clientes (ID_Cliente, Nome, Email, Telefone) VALUES
(1, 'Carla', 'carla@email.com', '9876543210'),
(2, 'Fernanda', 'fernanda@email.com', '9876543211'),
(3, 'Regina', 'regina@email.com', '9876543212');

INSERT INTO Produtos (ID_Produto, Nome, Preco, Categoria) VALUES
(1, 'Blusa', 19.99, 'Vestuário'),
(2, 'Teclado', 29.99, 'Eletrônicos'),
(3, 'Óculos', 12.50, 'Moda');

INSERT INTO Pedidos (ID_Pedido, ID_Cliente, Data_Pedido, Valor_Total) VALUES
(1, 1, '2023-01-15', 150.00),
(2, 2, '2023-02-20', 80.49),
(3, 3, '2023-03-10', 30.75);

INSERT INTO DetalhesDoPedido (ID_Detalhe, ID_Pedido, ID_Produto, Quantidade) VALUES
(1, 1, 1, 2),
(2, 1, 2, 1),  
(3, 2, 3, 3),
(4, 3, 1, 1),  
(5, 3, 2, 2);  

-- LEVEL 2
-- 1. Selecione todos os registros de uma tabela chamada "Clientes".
SELECT * FROM Clientes;

-- 2. Selecione apenas os nomes dos clientes da tabela "Clientes".
SELECT Nome FROM Clientes;

-- 3. Selecione todos os registros da tabela "Pedidos" onde o valor total seja superior a 100.
SELECT Valor_Total FROM Pedidos WHERE Valor_Total > 100;

-- 4. Selecione todos os produtos da tabela "Produtos" que tenham um preço menor que 50.
SELECT * FROM Produtos WHERE Preco < 100;

-- 5. Atualize o nome de um cliente na tabela "Clientes" para um novo nome de sua escolha.
UPDATE Clientes SET Nome = 'Joaquim' WHERE ID_Cliente = 1;

-- 6. Delete um registro da tabela "Produtos" com base em um critério específico, como o ID do produto.
-- tive que realizar a exclusão na tabela DetalhesPedido também, pois estavam referenciadas 
DELETE FROM DetalhesDoPedido WHERE ID_Produto = 1;
DELETE FROM Produtos WHERE ID_Produto = 1;

-- 7. Selecione todos os pedidos da tabela "Pedidos" que foram feitos por um cliente específico.
SELECT * FROM Pedidos WHERE ID_Cliente = 2;

-- 8. Calcule a média dos preços dos produtos na tabela "Produtos".
SELECT AVG(Preco) FROM Produtos;

-- 9. Crie uma nova tabela chamada "Funcionários" com colunas para nome, cargo e data de contratação, e insira alguns registros nela.
CREATE TABLE Funcionarios (
	ID_Funcionario INT NOT NULL,
    Nome VARCHAR(100), 
    Cargo VARCHAR(100), 
    Data_Contratacao Date, 
    PRIMARY KEY(ID_Funcionario)
);

INSERT INTO Funcionarios (ID_Funcionario, Nome, Cargo, Data_Contratacao) VALUES
(1, 'Jonas', 'Desenvolvedor', '2023-01-13'),
(2, 'Camila', 'Especialista em Recursos Humanos', '2023-04-23'),
(3, 'Mariana', 'Gerente de Logística', '2023-03-11');

-- LEVEL 3 
-- 1. Selecione todos os clientes que fizeram mais de 3 pedidos na tabela "Clientes" e "Pedidos".
SELECT Clientes.Nome
FROM Clientes
JOIN Pedidos ON Clientes.ID_Cliente = Pedidos.ID_Cliente
GROUP BY Clientes.ID_Cliente, Clientes.Nome
HAVING COUNT(Pedidos.ID_Pedido) > 3;

-- 2. Crie uma consulta que retorne o nome do cliente e o valor total de todos os pedidos feitos por ele.
SELECT Clientes.Nome, SUM(Pedidos.Valor_Total)
FROM Clientes
JOIN Pedidos ON Clientes.ID_Cliente = Pedidos.ID_Cliente
GROUP BY Clientes.Nome;

-- 3. Atualize os preços dos produtos na tabela "Produtos" com base em um aumento percentual específico.
UPDATE Produtos
SET Preco = Preco * 2.8;

-- 4. Crie uma consulta que retorne a lista de produtos mais vendidos com base na contagem de pedidos na tabela "Produtos" e "DetalhesDoPedido"
-- COUNT: SERVE PARA CONTAR OS PRODUTOS VENDIDOS
SELECT Produtos.Nome, COUNT(DetalhesDoPedido.ID_Pedido)
FROM Produtos JOIN DetalhesDoPedido ON Produtos.ID_Produto = DetalhesDoPedido.ID_Produto
GROUP BY Produtos.ID_Produto, Produtos.Nome;

-- 5. Crie uma consulta que calcule a média, a mediana e o desvio padrão dos preços dos produtos na tabela "Produtos".
SELECT AVG(Preco) AS MediaPreco,
PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY Preco) AS MedianaPreco,
STDDEV(Preco) AS DesvioPadraoPreco
FROM Produtos;

-- 6. Selecione todos os pedidos feitos em um período de tempo específico, usando a tabela "Pedidos" e um intervalo de datas.
SELECT * FROM Pedidos
WHERE Data_Pedido BETWEEN '2023-01-01' AND '2023-12-31';

-- 7. Crie uma consulta que identifique os clientes que não fizeram nenhum pedido nos últimos 6 meses na tabela "Clientes" e "Pedidos".
SELECT Clientes.*
FROM Clientes
LEFT JOIN Pedidos ON Clientes.ID_Cliente = Pedidos.ID_Cliente AND Pedidos.Data_Pedido >= CURRENT_DATE - INTERVAL '6 months' 
WHERE Pedidos.ID_Pedido IS NULL;

-- 8. Crie uma consulta que classifique os produtos na tabela "Produtos" com base em seu preço, em ordem decrescente.
SELECT * FROM Produtos
ORDER BY Preco DESC;

-- 9. Crie uma consulta que retorne o total de vendas por categoria de produto na tabela "Produtos" e "DetalhesDoPedido".
SELECT Categoria, SUM(Quantidade) FROM Produtos
JOIN DetalhesDoPedido ON Produtos.ID_Produto = DetalhesDoPedido.ID_Produto
GROUP BY Categoria;












