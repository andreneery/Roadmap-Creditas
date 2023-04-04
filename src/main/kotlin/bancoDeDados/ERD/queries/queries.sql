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
    CONCAT(
        DATEDIFF(CURDATE(), data_contratacao) DIV 365,
        ' anos e ',
        DATEDIFF(CURDATE(), data_contratacao) MOD 365 DIV 30,
        ' meses'
    ) AS tempo_empresa
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
SELECT s.squad_name, AVG(count_tripulante)
FROM (
  SELECT squad_id, COUNT(matricula) AS count_tripulante
  FROM tripulante_squad
  GROUP BY squad_id
) AS contar_tripulantes
INNER JOIN squad AS s ON contar_tripulantes.squad_id = s.squad_id
GROUP BY s.squad_name;


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
	COUNT(tripulante.matricula)
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
