USE TRIBE_EXERCISE;

-- Exercicio 1
-- Quantas pessoas com mais de 6 meses são desenvolvedoras na Creditas
SELECT * FROM TRIBE_EXERCISE.tripulante
WHERE data_contratacao < date_sub(NOW(), INTERVAL 6 MONTH) AND cargo = "Software Engineer";

-- Ex. 2
-- Quantas pessoas PM’s estão a menos de 1 ano na Creditas
SELECT * FROM TRIBE_EXERCISE.tripulante
WHERE data_contratacao > date_sub(NOW(), INTERVAL 12 MONTH) AND cargo = "Product Manager";

-- EX 3
-- Buscar o funcionario mais antigo na tabela e mostrar o tempo de empresa
SELECT
    nome,
        (DATEDIFF(CURDATE(), data_contratacao) DIV 30) / 12
    FROM TRIBE_EXERCISE.tripulante
WHERE
    data_contratacao = (SELECT MIN(data_contratacao) FROM TRIBE_EXERCISE.tripulante)

-- EX 4.
-- Selecionar a pessoa com maior numero de caracteres no nome
SELECT
    nome,
    LENGTH(nome) AS num_caracteres
    FROM TRIBE_EXERCISE.tripulante
    ORDER BY num_caracteres DESC
LIMIT 1;

--EX 5.
-- Qual a média de pessoas que as Squads tem
SELECT
  product_tech.tribo_name,
  count(distinct tripulante_squad.matricula) / count(distinct squad.squad_id) as media_tripulantes
FROM product_tech
JOIN squad ON product_tech.tribo_id = squad.tribo_id
JOIN tripulante_squad ON squad.squad_id = tripulante_squad.squad_id
GROUP BY product_tech.tribo_name;


--EX 6
-- Media de tempo de contratacao tem as squads
SELECT
	squad.squad_name,
	CONCAT(FLOOR(AVG(DATEDIFF(NOW(), tripulante.data_contratacao) / 365)), ' anos e ',
    MOD(FLOOR(AVG(DATEDIFF(NOW(), tripulante.data_contratacao) / 30)), 12), ' meses') as media_contratacao
FROM squad
INNER JOIN tripulante_squad ON squad.squad_id = tripulante_squad.squad_id
INNER JOIN tripulante ON tripulante_squad.matricula = tripulante.matricula
GROUP BY squad.squad_name;

--ex 7
-- Para cada Tribe, qual o total de pessoas trabalhando nela (Cuidado para não contas pessoas cross duas vezes)
SELECT
	product_tech.tribo_name,
	COUNT(distinct tripulante.matricula)
FROM product_tech
INNER JOIN squad ON product_tech.tribo_id = squad.tribo_id
INNER JOIN tripulante_squad ON squad.squad_id = tripulante_squad.squad_id
INNER JOIN tripulante ON tripulante_squad.matricula = tripulante.matricula
GROUP BY product_tech.tribo_name;

--ex 8
-- Para cada Tribe, qual o total de pessoas desenvolvedoras (Software engineer)
SELECT
	product_tech.tribo_name,
	COUNT(tripulante.matricula)
FROM product_tech
INNER JOIN squad ON product_tech.tribo_id = squad.tribo_id
INNER JOIN tripulante_squad ON squad.squad_id = tripulante_squad.squad_id
INNER JOIN tripulante ON tripulante_squad.matricula = tripulante.matricula
where tripulante.cargo = "Software Engineer"
GROUP BY product_tech.tribo_name;

-- ex 9
-- Para cada Tribe, quantas pessoas desenvolvedoras estão na Creditas a mais de 1 ano
USE TRIBE_EXERCISE;
SELECT
	product_tech.tribo_name,
	COUNT(tripulante.matricula)
FROM product_tech
INNER JOIN squad ON product_tech.tribo_id = squad.tribo_id
INNER JOIN tripulante_squad ON squad.squad_id = tripulante_squad.squad_id
INNER JOIN tripulante ON tripulante_squad.matricula = tripulante.matricula
where tripulante.cargo = 'Software Engineer' and CURRENT_DATE - data_contratacao > 360
GROUP BY product_tech.tribo_name;

-- ex 10
-- Para cada Tribe, qual a média de quantos meses as pessoas desenvolvedoras estão na Creditas
SELECT
	product_tech.tribo_name,
	CONCAT(FLOOR(AVG(DATEDIFF(NOW(), tripulante.data_contratacao) / 365)), ' anos e ',
    MOD(FLOOR(AVG(DATEDIFF(NOW(), tripulante.data_contratacao) / 30)), 12), ' meses') as media_contratacao
FROM tripulante
INNER JOIN tripulante_squad ON tripulante.matricula = tripulante_squad.matricula
INNER JOIN squad on tripulante_squad.squad_id = squad.squad_id
inner join product_tech on squad.tribo_id = product_tech.tribo_id
where tripulante.cargo = 'Software Engineer'
GROUP BY product_tech.tribo_name;

-- ex 11
-- Para cada Tribe, quantas séries cada squad assistiu (Cuidado para não contar a mesma série duas vezes numa mesma squad)
SELECT
    product_tech.tribo_name,
    squad.squad_name,
    COUNT(DISTINCT series.serie_name) AS qtd_series_assistidas
FROM tripulante
INNER JOIN series_assistidas ON tripulante.matricula = series_assistidas.matricula
INNER JOIN series ON series.serie_id = series_assistidas.serie_id
INNER JOIN tripulante_squad ON tripulante.matricula = tripulante_squad.matricula
INNER JOIN squad ON squad.squad_id = tripulante_squad.squad_id
INNER JOIN product_tech ON squad.tribo_id = product_tech.tribo_id
GROUP BY product_tech.tribo_name, squad.squad_name;

-- ex 12
-- Para cada Tribe, com exceção da Squad de top-up, quantas séries cada squad assistiu
USE TRIBE_EXERCISE;
SELECT
    product_tech.tribo_name,
    squad.squad_name,
    COUNT(DISTINCT series.serie_name) AS qtd_series_assistidas
FROM tripulante
INNER JOIN series_assistidas ON tripulante.matricula = series_assistidas.matricula
INNER JOIN series ON series.serie_id = series_assistidas.serie_id
INNER JOIN tripulante_squad ON tripulante.matricula = tripulante_squad.matricula
INNER JOIN squad ON squad.squad_id = tripulante_squad.squad_id
INNER JOIN product_tech ON squad.tribo_id = product_tech.tribo_id
where not squad.squad_name = 'topUp'
GROUP BY product_tech.tribo_name, squad.squad_name;

-- ex 13
-- Quem são as pessoas Cross da Tribe (Pessoas que atuam em mais de uma Squad)
USE TRIBE_EXERCISE;
SELECT nome
FROM tripulante
INNER JOIN tripulante_squad ON tripulante_squad.matricula = tripulante.matricula
GROUP BY tripulante.matricula
HAVING COUNT(DISTINCT tripulante_squad.squad_id) > 1;

-- ex 14
-- Quantas vezes cada série foi assistida por pessoas da Creditas
USE TRIBE_EXERCISE;
SELECT serie_name, COUNT(series_assistidas.serie_id) AS vezes_assistida
FROM series
LEFT JOIN series_assistidas ON series.serie_id = series_assistidas.serie_id
GROUP BY series.serie_id;

-- ex 15
-- Quais as 3 séries mais assistidas por pessoas da Creditas e quantas vezes cada uma foi vistas
USE TRIBE_EXERCISE;
SELECT serie_name, COUNT(series_assistidas.serie_id) AS vezes_assistida
FROM series
LEFT JOIN series_assistidas ON series.serie_id = series_assistidas.serie_id
GROUP BY series.serie_id
ORDER BY vezes_assistida DESC LIMIT 3;

-- ex 16
-- Para cada Squad, qual o cargo que assistiu a maior quantidade de séries diferentes e quantas foram
-- (Ex: Se todas as pessoas desenvolvedoras assistiram a mesma série, então o cargo desenvolvedor só assistiu
-- 1 série diferente)
SELECT
  squad_name,
  cargo,
  series_assistidas
FROM (
  SELECT
    squad.squad_name,
    tripulante.cargo,
    COUNT(DISTINCT series_assistidas.serie_id) as series_assistidas,
    RANK() OVER (PARTITION BY squad.squad_id ORDER BY COUNT(DISTINCT series_assistidas.serie_id) DESC) AS verificar
  FROM
    squad
    INNER JOIN tripulante_squad ON squad.squad_id = tripulante_squad.squad_id
    INNER JOIN tripulante ON tripulante_squad.matricula = tripulante.matricula
    INNER JOIN series_assistidas ON tripulante.matricula = series_assistidas.matricula
  GROUP BY
    squad.squad_id,
    squad.squad_name,
    tripulante.cargo
) AS subquery
WHERE
  verificar = 1;


-- ex 17
-- Quais são as séries que 2 ou mais pessoas desenvolvedoras já assistiram
USE TRIBE_EXERCISE;
SELECT series.serie_name, COUNT(series_assistidas.serie_id) AS vezes_assistida
FROM series
INNER JOIN series_assistidas ON series.serie_id = series_assistidas.serie_id
INNER JOIN tripulante ON series_assistidas.matricula = tripulante.matricula
where tripulante.cargo = 'Software Engineer'
GROUP BY series.serie_id
having count(distinct tripulante.matricula) >= 2
LIMIT 3;

-- ex 18
-- Quais as pessoas que não assistiram séries na Creditas
SELECT *
FROM tripulante
left join series_assistidas ON tripulante.matricula = series_assistidas.matricula
where series_assistidas.serie_id is NULL;
