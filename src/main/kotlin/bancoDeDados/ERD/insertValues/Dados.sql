USE TRIBE_EXERCISE;

INSERT INTO product_tech (tribo_name) VALUES ("Auto Equity");

-- TIME DE TOP-UP

INSERT INTO squad (squad_name, tribo_id) VALUES ("topUp", 1);

INSERT INTO tripulante(nome, data_contratacao, cargo, slack) VALUES ('Andre Nery', '2022-02-07', 'Software Engineer', 'andre.nery');

INSERT INTO tripulante(nome, data_contratacao, cargo, slack) VALUES ('Julia Mayumi', '2019-10-14', 'Software Engineer', 'julia.mayumi');

INSERT INTO tripulante(nome, data_contratacao, cargo, slack) VALUES ('Renan Kataoka', '2019-10-14', 'Software Engineer', 'renan.kataoka');

INSERT INTO tripulante(nome, data_contratacao, cargo, slack) VALUES ('Marcelo Rodrigues', '2019-07-22', 'Software Engineer', 'marcelinho');

INSERT INTO tripulante(nome, data_contratacao, cargo, slack) VALUES ('Ava Correia', '2021-08-16', 'Software Engineer', 'ava.correia');

INSERT INTO tripulante(nome, data_contratacao, cargo, slack) VALUES ('Izac Cavalheiro', '2021-11-16', 'Engineeer Lead', 'izac.cavalheiro');

INSERT INTO tripulante(nome, data_contratacao, cargo, slack) VALUES ('Nathalia Romaioli Gonzales', '2020-05-01', 'Product Manager', 'nathalia.gonzales');

INSERT INTO tripulante(nome, data_contratacao, cargo, slack) VALUES ('Eduardo Costa', '2020-11-23', 'Principal Engineer', 'jose.costa');

-- TIME DE LOANS

INSERT INTO squad (squad_name, tribo_id) VALUES ("Loans", 1);

INSERT INTO tripulante(nome, data_contratacao, cargo, slack) VALUES ('Lucas Medeiros', '2021-01-18', 'Software Engineer', 'lucas.santos1');

INSERT INTO tripulante(nome, data_contratacao, cargo, slack) VALUES ('Rafael Souza da Silva', '2019-09-23', 'Software Engineer', 'rafael.souza');

INSERT INTO tripulante(nome, data_contratacao, cargo, slack) VALUES ('Vitor Batista', '2022-03-01', 'Software Engineer', 'vitor.batista');

INSERT INTO tripulante(nome, data_contratacao, cargo, slack) VALUES ('Carolina Odorize', '2022-07-18', 'Engineeer Lead', 'carolina.odorize');

INSERT INTO tripulante(nome, data_contratacao, cargo, slack) VALUES ('Daniel Leite Meiato', '2022-08-17', 'Product Manager', 'daniel.meiato');

-- TABELA TRIPULANTE_SQUAD

INSERT INTO tripulante_squad(squad_id, matricula) VALUES (1, 1);

INSERT INTO tripulante_squad(squad_id, matricula) VALUES (1, 2);

INSERT INTO tripulante_squad(squad_id, matricula) VALUES (1, 3);

INSERT INTO tripulante_squad(squad_id, matricula) VALUES (1, 4);

INSERT INTO tripulante_squad(squad_id, matricula) VALUES (1, 5);

INSERT INTO tripulante_squad(squad_id, matricula) VALUES (1, 6);

INSERT INTO tripulante_squad(squad_id, matricula) VALUES (1, 7);

INSERT INTO tripulante_squad(squad_id, matricula) VALUES (1, 8);

INSERT INTO tripulante_squad(squad_id, matricula) VALUES (2, 8);

INSERT INTO tripulante_squad(squad_id, matricula) VALUES (2, 9);

INSERT INTO tripulante_squad(squad_id, matricula) VALUES (2, 10);

INSERT INTO tripulante_squad(squad_id, matricula) VALUES (2, 11);

INSERT INTO tripulante_squad(squad_id, matricula) VALUES (2, 12);

INSERT INTO tripulante_squad(squad_id, matricula) VALUES (2, 13);

-- SERIES
INSERT INTO series (serie_name)
VALUES ('Breaking Bad');

INSERT INTO series (serie_name)
VALUES ('Game of Thrones');

INSERT INTO series (serie_name)
VALUES ('Stranger Things');

INSERT INTO series (serie_name)
VALUES ('Friends');

INSERT INTO series (serie_name)
VALUES ('The Office');

INSERT INTO series (serie_name)
VALUES ('The Crown');

INSERT INTO series (serie_name)
VALUES ('Narcos');

INSERT INTO series (serie_name)
VALUES ('House of Cards');

INSERT INTO series (serie_name)
VALUES ('Black Mirror');

INSERT INTO series (serie_name)
VALUES ('Peaky Blinders');

-- SERIES ASSISTIDAS

-- MATRICULA 1 - ANDRÉ NERY
INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (1, 1, NOW());

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (2, 1, '2022-02-22');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (3, 1, '2022-02-21');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (6, 1, '2022-02-20');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (9, 1, '2022-02-19');

-- MATRICULA 2 - JULIA
INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (2, 2, NOW());

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (4, 2, '2022-02-21');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (7, 2, '2022-02-19');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (9, 2, '2021-01-10');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (10, 2, '2020-05-23');

-- MATRICULA 3 - RENAN
INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (1, 3, NOW());

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (3, 3, '2022-02-20');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (5, 3, '2022-02-18');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (7, 3, '2022-02-17');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (8, 3, '2022-02-16');

-- MATRICULA 4 - MARCELO
INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (3, 4, NOW());

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (6, 4, '2022-02-19');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (8, 4, '2022-02-17');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (9, 4, '2022-02-15');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (10, 4, '2022-02-14');

-- MATRICULA 5 - AVA
INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (1, 5, NOW());

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (2, 5, '2022-02-22');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (4, 5, '2022-02-19');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (6, 5, '2022-02-17');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (10, 5, '2022-02-16');

-- MATRICULA 6 - IZAC

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (2, 6, NOW());

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (4, 6, '2022-02-21');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (7, 6, '2022-02-19');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (9, 6, '2022-02-18');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (10, 6, '2022-02-17');

-- MATRICULA 7 - LUCAS

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (1, 7, NOW());

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (3, 7, '2022-02-20');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (5, 7, '2022-02-18');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (7, 7, '2022-02-17');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (8, 7, '2022-02-16');

-- MATRICULA 8 - RAFAEL

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (3, 8, NOW());

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (6, 8, '2022-02-19');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (1, 8, '2022-02-17');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (9, 8, '2022-02-15');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (10, 8, '2022-02-14');

-- MATRICULA 9 - VITOR

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (1, 9, NOW());

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (2, 9, '2022-02-22');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (4, 9, '2022-02-19');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (6, 9, '2022-02-17');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (10, 9, '2022-02-16');

-- MATRICULA 10 - CAROL

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (7, 10, '2022-02-17');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (8, 10, '2022-02-16');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (3, 10, NOW());

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (6, 10, '2022-02-19');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (1, 10, '2022-02-17');
