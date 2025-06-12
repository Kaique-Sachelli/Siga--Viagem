/*
SELECT @@default_storage_engine ;
CREATE SCHEMA simulador ;
USE  simulador;

DROP TABLE IF EXISTS usuario ;
CREATE TABLE usuario
(id_usuario INT PRIMARY KEY AUTO_INCREMENT, 
nome VARCHAR(45) NOT NULL, 
login VARCHAR(30) NOT NULL UNIQUE, 
senha VARCHAR(200) NOT NULL,
instrutor BOOL NOT NULL DEFAULT FALSE) ;

DROP TABLE IF EXISTS estatistica;
CREATE TABLE estatistica
(id_usuario INT NOT NULL, 
tentativa INT NOT NULL,
data_simulacao DATETIME NOT NULL,
erros TINYINT(3),
acertos TINYINT(3),
pontuacao SMALLINT(4),
erro_fatal BOOL,
abandonada BOOL NOT NULL,
PRIMARY KEY (id_usuario, tentativa), 
FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
	ON DELETE CASCADE ON UPDATE CASCADE); 

-- povoando usuario
INSERT INTO usuario(nome, login, senha, instrutor) VALUES
("Fabio", "23446899765-9", "g456770Gu", 
False) ;
INSERT INTO usuario(nome, login, senha, instrutor) VALUES
("Jordana Balestrin", "2365-9", "g4567fsdfsGu", 
True) ;
INSERT INTO usuario(nome, login, senha, instrutor) VALUES 
("Gustavo Martin", "564548-1", "g255532GM",
True) ; 
INSERT INTO usuario(nome, login, senha, instrutor) VALUES 
("Kaique Sachelli", "556778-8", "g44566Kq",
True) ;
INSERT INTO usuario(nome, login, senha, instrutor) VALUES 
("Erick Ken", "878659-2", "g45634Ek", 
True) ;
INSERT INTO usuario(nome, login, senha, instrutor) VALUES 
("Guilherme Visone", "456789-4", "g456322Gui",
True) ; 
INSERT INTO usuario(nome, login, senha, instrutor) VALUES 
("Pedro Moreno", "67975-5", "g445655Pe",
True) ;
INSERT INTO usuario(nome, login, senha, instrutor) VALUES 
("Júnior Alves", "3232544-6", "j554363",
False) ;
INSERT INTO usuario(nome, login, senha, instrutor) VALUES 
("Maria Silva", "2547463-0", "ms12836",
False) ;
INSERT INTO usuario(nome, login, senha, instrutor) VALUES 
("Joelma Mendes", "738373-1", "7237mm753",
False) ; 
INSERT INTO usuario(nome, login, senha, instrutor) VALUES 
("Instrutor", "Instrutor", "1234", 
True) ; 
INSERT INTO usuario(nome, login, senha, instrutor) VALUES
("Operador", "Operador", "1234", FALSE );

SELECT u.nome AS Usuario,
e.tentativa,
e.data_simulacao,
e.erros,
e.acertos,
e.erro_fatal,
e.abandonada,
e.pontuacao
FROM estatistica e
JOIN usuario u ON (e.id_usuario = u.id_usuario)
WHERE u.id_usuario = 1 ;

SELECT * FROM estatistica ;
SELECT * FROM usuario ;
SELECT * FROM estatistica ;

SELECT 
    DENSE_RANK() OVER (ORDER BY e.pontuacao DESC) AS posicao,
    u.nome AS nome_usuario,
    SUM(e.pontuacao) AS pontuacao_total
FROM 
    estatistica e
JOIN 
    usuario u ON e.id_usuario = u.id_usuario
WHERE tentativa = 3
GROUP BY 
    u.id_usuario, u.nome
ORDER BY 
    posicao;
    
SELECT * FROM estatistica
JOIN usuario USING(id_usuario)
WHERE id_usuario = 1;

SELECT
e.tentativa,
e.data_simulacao,
e.erros,
e.acertos,
e.erro_fatal,
e.abandonada,
e.pontuacao
FROM estatistica e
JOIN usuario u ON (e.id_usuario = u.id_usuario)
WHERE u.id_usuario = 1 ;

UPDATE usuario SET login = "1234" WHERE id_usuario = 1;

WITH ranking AS(
SELECT e.id_usuario,
DENSE_RANK() OVER(ORDER BY e.pontuacao DESC) as posicao
FROM estatistica e
JOIN usuario u ON e.id_usuario = u.id_usuario
WHERE e.tentativa = 1 AND u.instrutor = FALSE )
SELECT posicao
FROM ranking
WHERE id_usuario = 1;

SELECT
e.tentativa,
e.data_simulacao,
e.erros,
e.acertos,
e.erro_fatal,
e.abandonada,
e.pontuacao
FROM estatistica e
JOIN usuario u ON (e.id_usuario = u.id_usuario)
WHERE u.id_usuario = 1 ;

-- povoando estatisticas para teste
INSERT INTO estatistica (id_usuario, tentativa, data_simulacao, erros, acertos, pontuacao, erro_fatal, abandonada) VALUES
(1, 1, '2025-06-11 10:00:00', 2, 8, 700, 0, 0),
(1, 2, '2025-06-11 10:15:00', 5, 4, 150, 0, 0),
(1, 3, '2025-06-11 10:30:00', 3, 7, 0, 1, 0), 
(1, 4, '2025-06-11 10:45:00', 1, 9, 850, 0, 0);


INSERT INTO estatistica (id_usuario, tentativa, data_simulacao, erros, acertos, pontuacao, erro_fatal, abandonada) VALUES
(8, 1, '2025-06-11 13:00:00', 5, 4, 150, 0, 0),
(8, 2, '2025-06-11 13:18:00', 3, 6, 450, 0, 0);

INSERT INTO estatistica (id_usuario, tentativa, data_simulacao, erros, acertos, pontuacao, erro_fatal, abandonada) VALUES
(4, 1, CURRENT_TIMESTAMP(), 1, 7, 650, 0, 0),
(4, 2, CURRENT_TIMESTAMP(), 2, 8, 700, 0, 0),
(4, 3, CURRENT_TIMESTAMP(), 5, 2, 0, 0, 0),
(4, 4, CURRENT_TIMESTAMP(), 3, 6, 450, 0, 0),
(4, 5, CURRENT_TIMESTAMP(), 0, 4, 0, 0, 1);


INSERT INTO estatistica (id_usuario, tentativa, data_simulacao, erros, acertos, pontuacao, erro_fatal, abandonada) VALUES
(5, 1, CURRENT_TIMESTAMP(), 3, 8, 6, 0, 0),
(5, 2, CURRENT_TIMESTAMP(), 1, 9, 8, 0, 0),
(5, 3, CURRENT_TIMESTAMP(), 4, 5, 3, 0, 0),
(5, 4, CURRENT_TIMESTAMP(), 2, 7, 600, 0, 0),
(5, 5, CURRENT_TIMESTAMP(), 5, 4, 150, 0, 0);


INSERT INTO estatistica (id_usuario, tentativa, data_simulacao, erros, acertos, pontuacao, erro_fatal, abandonada) VALUES
(6, 1, CURRENT_TIMESTAMP(), 2, 9, 8, 0, 0),
(6, 2, CURRENT_TIMESTAMP(), 1, 8, 7, 0, 0),
(6, 3, CURRENT_TIMESTAMP(), 0, 10, 10, 0, 0),
(6, 4, CURRENT_TIMESTAMP(), 3, 7, 0, 1, 0),
(6, 5, CURRENT_TIMESTAMP(), 2, 5, 4, 0, 0);

INSERT INTO estatistica (id_usuario, tentativa, data_simulacao, erros, acertos, pontuacao, erro_fatal, abandonada) VALUES
(7, 1, CURRENT_TIMESTAMP(), 4, 6, 4, 0, 0),
(7, 2, CURRENT_TIMESTAMP(), 2, 4, 3, 0, 0),
(7, 3, CURRENT_TIMESTAMP(), 1, 7, 6, 0, 0),
(7, 4, CURRENT_TIMESTAMP(), 3, 8, 6, 0, 0),
(7, 5, CURRENT_TIMESTAMP(), 1, 3, 0, 0, 1);



INSERT INTO estatistica (id_usuario, tentativa, data_simulacao, erros, acertos, pontuacao, erro_fatal, abandonada) VALUES
(9, 1, CURRENT_TIMESTAMP(), 2, 7, 6, 0, 0),
(9, 2, CURRENT_TIMESTAMP(), 1, 6, 5, 0, 0),
(9, 3, CURRENT_TIMESTAMP(), 3, 5, 0, 1, 0),
(9, 4, CURRENT_TIMESTAMP(), 0, 8, 8, 0, 0),
(9, 5, CURRENT_TIMESTAMP(), 4, 9, 7, 0, 0);


INSERT INTO estatistica (id_usuario, tentativa, data_simulacao, erros, acertos, pontuacao, erro_fatal, abandonada) VALUES
(10, 1, CURRENT_TIMESTAMP(), 3, 3, 15, 0, 0),
(10, 2, CURRENT_TIMESTAMP(), 2, 2, 10, 0, 0),
(10, 3, CURRENT_TIMESTAMP(), 4, 1, 0, 0, 0),
(10, 4, CURRENT_TIMESTAMP(), 5, 0, 0, 0, 0),
(10, 5, CURRENT_TIMESTAMP(), 1, 4, 0, 0, 1);


INSERT INTO estatistica (id_usuario, tentativa, data_simulacao, erros, acertos, pontuacao, erro_fatal, abandonada) VALUES
(11, 1, CURRENT_TIMESTAMP(), 1, 9, 8, 0, 0),
(11, 2, CURRENT_TIMESTAMP(), 0, 10, 10, 0, 0),
(11, 3, CURRENT_TIMESTAMP(), 2, 8, 7, 0, 0),
(11, 4, CURRENT_TIMESTAMP(), 1, 7, 6, 0, 0),
(11, 5, CURRENT_TIMESTAMP(), 0, 9, 9, 0, 0);

INSERT INTO estatistica (id_usuario, tentativa, data_simulacao, erros, acertos, pontuacao, erro_fatal, abandonada) VALUES
(12, 1, CURRENT_TIMESTAMP(), 3, 6, 5, 0, 0),
(12, 2, CURRENT_TIMESTAMP(), 2, 7, 2, 0, 0),
(12, 3, CURRENT_TIMESTAMP(), 4, 5, 3, 0, 0),
(12, 4, CURRENT_TIMESTAMP(), 1, 8, 7, 0, 0),
(12, 5, CURRENT_TIMESTAMP(), 2, 4, 0, 1, 0);

SELECT IFNULL(MAX(tentativa), 0) + 1 AS proxima_tentativa FROM estatistica WHERE id_usuario = 2

WITH ranking AS (
SELECT e.id_usuario,
DENSE_RANK() OVER(ORDER BY e.pontuacao DESC) as posicao
FROM estatistica e
JOIN usuario u ON e.id_usuario = u.id_usuario
WHERE e.tentativa = 1 AND
u.instrutor = false )
SELECT posicao
FROM ranking
WHERE id_usuario = 1;

SELECT VERSION();

SELECT posicao
FROM
(SELECT
e.id_usuario,
DENSE_RANK() OVER (ORDER BY e.pontuacao DESC) as posicao
FROM
estatistica e
JOIN
usuario u ON e.id_usuario = u.id_usuario
WHERE
e.tentativa = 1 AND u.instrutor = false
) AS ranking
WHERE
id_usuario = 1;

*/