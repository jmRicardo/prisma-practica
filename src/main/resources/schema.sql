CREATE TABLE candidates (
                              candidate_id int NOT NULL AUTO_INCREMENT,
                              first_name varchar(45) NOT NULL,
                              last_name varchar(45) NOT NULL,
                              type varchar(10) NOT NULL,
                              document varchar(20) NOT NULL,
                              date_of_birth date NOT NULL,
                              PRIMARY KEY (candidate_id),
                              UNIQUE (document)
);

CREATE TABLE technologies (
                                id_technology int NOT NULL AUTO_INCREMENT,
                                name varchar(45) NOT NULL,
                                version varchar(45) NOT NULL,
                                PRIMARY KEY (id_technology),
                                UNIQUE (name,version)
);

CREATE TABLE technologies_by_candidate (
                                             id_technologies_by_candidate bigint NOT NULL,
                                             exp int NOT NULL,
                                             id_tecnology bigint DEFAULT NULL,
                                             id_candidate bigint DEFAULT NULL,
                                             PRIMARY KEY (id_technologies_by_candidate),
                                             UNIQUE (id_tecnology,id_candidate)
);