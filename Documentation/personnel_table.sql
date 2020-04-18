DROP DATABASE IF EXISTS Personnel;
CREATE DATABASE Personnel;
use Personnel;

DROP TABLE IF EXISTS Ligue;
DROP TABLE IF EXISTS Employe;
DROP TABLE IF EXISTS Habilitation;

CREATE TABLE Ligue
(
idLigue int(3) AUTO_INCREMENT not null,
nom varchar (50) not null,
Constraint PK_idLigue PRIMARY KEY (idLigue)
)
ENGINE=INNODB;

CREATE TABLE Employe
(
idEmploye int(3) AUTO_INCREMENT not null,
nom varchar (50) not null,
prenom varchar (50) not null,
mail varchar (50) not null,
password varchar(100) not null, /*ultérieurement changer le type pour password*/
dateArrive date,
dateDepart date,
idLigue int(3) not null,
Constraint PK_idEmploye PRIMARY KEY (idEmploye)
)
ENGINE=INNODB;