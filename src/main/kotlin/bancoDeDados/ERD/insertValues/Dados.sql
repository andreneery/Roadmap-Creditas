USE tribe_exercise;

INSERT INTO product_tech (tribo_name) VALUES ("Auto Equity");

--TIME DE TOP-UP

INSERT INTO squad (squad_name, tribo_id) VALUES ("topUp", 1);

INSERT INTO tripulantes_squad (nome, tempo_empresa, cargo, slack, squad_id) VALUES ('Andre Nery', 1.20, 'estagiário', 'andre.nery', 1);

INSERT INTO tripulantes_squad (nome, tempo_empresa, cargo, slack, squad_id) VALUES ('Julia Mayumi', 3.40, 'Software Engineer', 'julia.mayumi', 1);

INSERT INTO tripulantes_squad (nome, tempo_empresa, cargo, slack, squad_id) VALUES ('Renan Kataoka', 3.40, 'Software Engineer', 'renan.kataoka', 1);

INSERT INTO tripulantes_squad (nome, tempo_empresa, cargo, slack, squad_id) VALUES ('Marcelo Rodrigues', 3.70, 'Software Engineer', 'marcelinho', 1);

INSERT INTO tripulantes_squad (nome, tempo_empresa, cargo, slack, squad_id) VALUES ('Ava Correia', 1.60, 'Software Engineer', 'ava.correia', 1);

INSERT INTO tripulantes_squad (nome, tempo_empresa, cargo, slack, squad_id) VALUES ('Izac Cavalheiro', 1.30, 'Engineeer Lead', 'izac.cavalheiro', 1);

-- TIME DE LOANS

INSERT INTO squad (squad_name, tribo_id) VALUES ("Loans", 1);

INSERT INTO tripulantes_squad (nome, tempo_empresa, cargo, slack, squad_id) VALUES ('Lucas Medeiros', 2.1, 'Software Engineer', 'lucas.santos1', 8);

INSERT INTO tripulantes_squad (nome, tempo_empresa, cargo, slack, squad_id) VALUES ('Rafael Souza da Silva', 3.5, 'Software Engineer', 'rafael.souza', 8);

INSERT INTO tripulantes_squad (nome, tempo_empresa, cargo, slack, squad_id) VALUES ('Vitor Batista', 2.0, 'Software Engineer', 'vitor.batista', 8);

INSERT INTO tripulantes_squad (nome, tempo_empresa, cargo, slack, squad_id) VALUES ('Carolina Odorize', 0.7, 'Engineeer Lead', 'carolina.odorize', 8);

--SERIES
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

--SERIES ASSISTIDAS

-- MATRICULA 1 - ANDRÉ NERY
INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (1, 1, NOW());

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (2, 1, '2022-02-22 10:30:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (3, 1, '2022-02-21 15:45:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (6, 1, '2022-02-20 19:00:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (9, 1, '2022-02-19 22:15:00');

-- MATRICULA 2 - JULIA
INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (2, 2, NOW());

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (4, 2, '2022-02-21 16:30:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (7, 2, '2022-02-19 20:45:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (9, 2, '2022-02-18 23:00:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (10, 2, '2022-02-17 19:15:00');

-- MATRICULA 3 - RENAN
INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (1, 3, NOW());

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (3, 3, '2022-02-20 12:00:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (5, 3, '2022-02-18 16:15:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (7, 3, '2022-02-17 22:30:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (8, 3, '2022-02-16 18:45:00');

-- MATRICULA 4 - MARCELO
INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (3, 4, NOW());

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (6, 4, '2022-02-19 14:00:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (8, 4, '2022-02-17 18:15:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (9, 4, '2022-02-15 22:30:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (10, 4, '2022-02-14 20:45:00');

-- MATRICULA 5 - AVA
INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (1, 5, NOW());

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (2, 5, '2022-02-22 08:30:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (4, 5, '2022-02-19 14:45:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (6, 5, '2022-02-17 19:00:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (10, 5, '2022-02-16 23:15:00');

-- MATRICULA 6 - IZAC

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (2, 6, NOW());

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (4, 6, '2022-02-21 16:30:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (7, 6, '2022-02-19 20:45:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (9, 6, '2022-02-18 23:00:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (10, 6, '2022-02-17 19:15:00');

-- MATRICULA 7 - LUCAS

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (1, 7, NOW());

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (3, 7, '2022-02-20 12:00:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (5, 7, '2022-02-18 16:15:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (7, 7, '2022-02-17 22:30:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (8, 7, '2022-02-16 18:45:00');

--MATRICULA 8 - RAFAEL

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (3, 8, NOW());

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (6, 8, '2022-02-19 14:00:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (1, 8, '2022-02-17 18:15:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (9, 8, '2022-02-15 22:30:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (10, 8, '2022-02-14 20:45:00');

--MATRICULA 9 - VITOR

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (1, 9, NOW());

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (2, 9, '2022-02-22 08:30:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (4, 9, '2022-02-19 14:45:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (6, 9, '2022-02-17 19:00:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (10, 9, '2022-02-16 23:15:00');

-- MATRICULA 10 - CAROL

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (7, 10, '2022-02-17 22:30:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (8, 10, '2022-02-16 18:45:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (3, 10, NOW());

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (6, 10, '2022-02-19 14:00:00');

INSERT INTO series_assistidas (serie_id, matricula, assistiu)
VALUES (1, 10, '2022-02-17 18:15:00');


