CREATE DATABASE IF NOT EXISTS TRIBE_EXERCISE;

USE TRIBE_EXERCISE;

CREATE TABLE product_tech(
    tribo_name varchar(50) not null,
    tribo_id int not null AUTO_INCREMENT,
    PRIMARY KEY(tribo_id)
);

CREATE TABLE squad(
    squad_name varchar(50) NOT NULL,
    squad_id int NOT Null AUTO_INCREMENT,
    tribo_id int NOT NULL,
    PRIMARY KEY (squad_id),
    FOREIGN KEY (tribo_id) REFERENCES product_tech(tribo_id)
);

CREATE TABLE tripulante(
    matricula int NOT NULL AUTO_INCREMENT,
    nome varchar(50) NOT NULL,
    data_contratacao date NOT NULL,
    cargo varchar(50) NOT NULL,
    slack varchar(50) NOT NULL,
    PRIMARY KEY (matricula)
);

CREATE TABLE tripulante_squad(
    tripulante_squad_id int NOT NULL AUTO_INCREMENT,
    squad_id int NOT NULL,
    matricula int NOT NULL,
    PRIMARY KEY (tripulante_squad_id),
    FOREIGN KEY (squad_id) REFERENCES squad(squad_id),
    FOREIGN KEY (matricula) REFERENCES tripulante(matricula)
);

CREATE TABLE series(
    serie_id int NOT NULL AUTO_INCREMENT,
    serie_name varchar(50) NOT NULL,
    PRIMARY KEY (serie_id)
);

CREATE TABLE series_assistidas(
    serie_id int NOT NULL,
    matricula int NOT NULL,
    assistiu date not null,
    PRIMARY KEY (serie_id, matricula),
    FOREIGN KEY (serie_id) REFERENCES series(serie_id),
    FOREIGN KEY (matricula) REFERENCES tripulante(matricula)
);
