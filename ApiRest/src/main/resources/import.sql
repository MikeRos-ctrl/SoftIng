INSERT INTO Promotor (id,nombre, apellidoPaterno, apellidoMaterno) VALUES ("1940851", "Ricardo", "Rosales", "Ramos");
INSERT INTO Promotor (id,nombre, apellidoPaterno, apellidoMaterno) VALUES ("BRS101299", "Ricardo", "Limones", "Golfo");
INSERT INTO Sucursal (numero, direccion) VALUES (777, "Ciudad Gotica");
INSERT INTO Pais (nombre) VALUES ("Mexico");
INSERT INTO Estado (nombre, pais_id) VALUES ("Veracruz", "Mexico");
INSERT INTO Estado (nombre, pais_id) VALUES ("Nuevo Leon", "Mexico");
INSERT INTO Ciudad (nombre, estado_id) VALUES ("Monterrey", "Nuevo Leon");
INSERT INTO Ciudad (nombre, estado_id) VALUES ("San Nicolas de los Garza", "Nuevo Leon");
INSERT INTO Colonia (nombre, ciudad_id) VALUES ("La Gloria", "San Nicolas de los Garza");
INSERT INTO Colonia (nombre, ciudad_id) VALUES ("San Antonio", "San Nicolas de los Garza");

INSERT INTO CodigoPostal (codigo, pais_id, estado_id, ciudad_id) VALUES ("96538", "Mexico","Nuevo Leon", "San Nicolas de los Garza");