DROP TABLE Client;
CREATE TABLE Client (
	cl_id INT AUTO_INCREMENT primary key NOT NULL,
	cl_name VARCHAR(20) NOT NULL,
	cl_surname VARCHAR(20) NOT NULL,
	cl_num_personal_code VARCHAR(13) NOT NULL,
	cl_phone_nr VARCHAR(10) NOT NULL
);

DROP TABLE Angajat;
CREATE TABLE Angajat(
	an_id INT AUTO_INCREMENT primary key NOT NULL,
	an_name VARCHAR(20) NOT NULL,
	an_surname VARCHAR(20) NOT NULL,
	an_num_personal_code VARCHAR(13) NOT NULL,
	an_phone_nr VARCHAR(10) NOT NULL,
	an_salary VARCHAR(10) NOT NULL
);accountmember

DROP TABLE Account;
CREATE TABLE Account(
	cn_id INT AUTO_INCREMENT primary key NOT NULL,
	cn_client_id_fk INT NOT NULL,
	cn_angajat_id_fk INT NOT NULL,
	cn_balance INT NOT NULL DEFAULT 0
);

ALTER TABLE Account ADD CONSTRAINT k1 FOREIGN KEY (cn_angajat_id_fk) REFERENCES Angajat(an_id);
ALTER TABLE Account ADD CONSTRAINT k2 FOREIGN KEY (cn_client_id_fk) REFERENCES Client(cl_id);

INSERT INTO Angajat VALUES ('Ion','Ionut',		   '1111111111111', '0722222222', 2500);
INSERT INTO Angajat VALUES ('Marinescu','Marian',  '2222222222222', '0733333333', 2400);
INSERT INTO Angajat VALUES ('Stefanescu','Stefan', '3333333333333', '0744444444', 2300);

INSERT INTO Client VALUES ('Cristian', 'Cristi',  '4444444444444', '0755555555');
INSERT INTO Client VALUES ('Mihailescu', 'Mihai', '5555555555555', '0766666666');
INSERT INTO Client VALUES ('Dorian', 'Dorin',	  '6666666666666', '0777777777');

INSERT INTO account (cn_client_id_fk, cn_angajat_id_fk, cn_balance) VALUES (3, 2, 5000);
INSERT INTO account (cn_client_id_fk, cn_angajat_id_fk, cn_balance) VALUES (1, 3, 50);
INSERT INTO account (cn_client_id_fk, cn_angajat_id_fk, cn_balance) VALUES (2, 1,	600);
