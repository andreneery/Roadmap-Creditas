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

CREATE TABLE tripulantes_squad(
    matricula int NOT NULL AUTO_INCREMENT,
    nome varchar(50) NOT NULL,
    tempo_empresa numeric(2,2) NOT NULL,
    cargo varchar(50) NOT NULL,
    slack varchar(50) NOT NULL,
    squad_id int NOT NULL,
    PRIMARY KEY (matricula),
    FOREIGN KEY (squad_id) REFERENCES squad(squad_id)
);

CREATE TABLE series(
    serie_id int NOT NULL AUTO_INCREMENT,
    serie_name varchar(50) NOT NULL,
    PRIMARY KEY (serie_id)
);

CREATE TABLE series_assistidas(
    serie_id int NOT NULL,
    matricula int NOT NULL,
    assistiu TIMESTAMP WITH TIME ZONE,
    PRIMARY KEY (serie_id, matricula),
    FOREIGN KEY (serie_id) REFERENCES series(serie_id),
    FOREIGN KEY (matricula) REFERENCES tripulantes_squad(matricula)
);
