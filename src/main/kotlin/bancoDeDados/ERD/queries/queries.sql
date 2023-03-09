-- Exercicio 1
-- Quantas pessoas com mais de 6 meses são desenvolvedoras na Creditas
SELECT * FROM TRIBE_EXERCISE.tripulante
WHERE data_contratacao < date_sub(NOW(), INTERVAL 6 MONTH) AND cargo = "Software Engineer";

-- Ex. 2
-- Quantas pessoas PM’s estão a menos de 1 ano na Creditas
SELECT * FROM TRIBE_EXERCISE.tripulante
WHERE data_contratacao > date_sub(NOW(), INTERVAL 12 MONTH) AND cargo = "Product Manager";

