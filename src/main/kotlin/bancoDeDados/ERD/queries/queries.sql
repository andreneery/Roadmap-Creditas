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

