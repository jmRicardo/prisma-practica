CREATE TABLE candidates (
                              id_candidate bigint NOT NULL AUTO_INCREMENT,
                              first_name varchar(45) NOT NULL,
                              last_name varchar(45) NOT NULL,
                              type varchar(10) NOT NULL,
                              document varchar(20) NOT NULL,
                              date_of_birth date NOT NULL,
                              PRIMARY KEY (id_candidate),
                              UNIQUE (document)
);

CREATE TABLE technologies (
                                id_technology bigint NOT NULL AUTO_INCREMENT,
                                name varchar(45) NOT NULL,
                                version varchar(45) NOT NULL,
                                PRIMARY KEY (id_technology),
                                UNIQUE (name,version)
);

CREATE TABLE technologies_by_candidate (
                                             id_technologies_by_candidate bigint NOT NULL AUTO_INCREMENT,
                                             exp int NOT NULL,
                                             id_tecnology bigint not null,
                                             id_candidate bigint not null,
                                             PRIMARY KEY (id_technologies_by_candidate),
                                             UNIQUE (id_tecnology,id_candidate)
);