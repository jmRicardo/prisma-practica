INSERT INTO TECHNOLOGIES(name, version) VALUES ('Java','15');
INSERT INTO TECHNOLOGIES(name, version) VALUES ('Python','3.9.2');
INSERT INTO TECHNOLOGIES(name, version) VALUES ('Maven','4.0.0');
INSERT INTO TECHNOLOGIES(name, version) VALUES ('Hibernate','5.4.0 final');
INSERT INTO TECHNOLOGIES(name, version) VALUES ('Spring','2.4.2');
INSERT INTO TECHNOLOGIES(name, version) VALUES ('Java','8');
INSERT INTO TECHNOLOGIES(name, version) VALUES ('Django','3.1.3');
INSERT INTO TECHNOLOGIES(name, version) VALUES ('MySQL','8.0.22');
INSERT INTO TECHNOLOGIES(name, version) VALUES ('MongoDB','4.0.8');

INSERT INTO CANDIDATES(FIRST_NAME, LAST_NAME, TYPE, DOCUMENT, DATE_OF_BIRTH) VALUES ( 'Noob','Saibot', 'DNI', '800.000','1920-01-01');
INSERT INTO CANDIDATES(FIRST_NAME, LAST_NAME, TYPE, DOCUMENT, DATE_OF_BIRTH) VALUES ( 'Mario','Bros', 'DNI', '25.000.000','1983-03-02');
INSERT INTO CANDIDATES(FIRST_NAME, LAST_NAME, TYPE, DOCUMENT, DATE_OF_BIRTH) VALUES ( 'Samus','Aran', 'DNI', '30.000.000','1986-02-03');

INSERT INTO TECHNOLOGIES_BY_CANDIDATE(experience, id_tecnology, id_candidate) values ( 5,1,1 );
INSERT INTO TECHNOLOGIES_BY_CANDIDATE(experience, id_tecnology, id_candidate) values ( 5,3,1 );
INSERT INTO TECHNOLOGIES_BY_CANDIDATE(experience, id_tecnology, id_candidate) values ( 5,5,1 );

INSERT INTO TECHNOLOGIES_BY_CANDIDATE(experience, id_tecnology, id_candidate) values ( 20,2,2 );
INSERT INTO TECHNOLOGIES_BY_CANDIDATE(experience, id_tecnology, id_candidate) values ( 7,6,2 );
INSERT INTO TECHNOLOGIES_BY_CANDIDATE(experience, id_tecnology, id_candidate) values ( 10,7,2 );

INSERT INTO TECHNOLOGIES_BY_CANDIDATE(experience, id_tecnology, id_candidate) values ( 14,8,3 );
INSERT INTO TECHNOLOGIES_BY_CANDIDATE(experience, id_tecnology, id_candidate) values ( 10,4,3 );
INSERT INTO TECHNOLOGIES_BY_CANDIDATE(experience, id_tecnology, id_candidate) values ( 5,9,3 );


