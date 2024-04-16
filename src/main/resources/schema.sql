CREATE TABLE Bilet
(
    id SMALLINT NOT NULL AUTO_INCREMENT,
    filmNavn VARCHAR(255) NOT NULL,
    antall INTEGER NOT NULL,
    fornavn VARCHAR(255) NOT NULL,
    etternavn VARCHAR(255) NOT NULL,
    telefonNr VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);
CREATE TABLE Filmer (
    categori VARCHAR(50) NOT NULL,
    filmNavn VARCHAR(50) NOT NULL,
    PRIMARY KEY (filmNavn)
);
