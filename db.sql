# Necesario para el funcionamiento de la aplicacion (EJECUTAR UNA VEZ AL INICIAR EL PROYECTO)

CREATE DATABASE infomedica;
USE infomedica;

# Tablas y relacion de la base de datos (NO EJECUTAR EL SIGUIENTE CODIGO)

CREATE TABLE citas (
  id_ct INT(11) NOT NULL AUTO_INCREMENT,
  direccion_ct VARCHAR(30) NOT NULL,
  fecha_ct DATE NOT NULL,
  hora_ct TIME NOT NULL,
  edadPac_ct INT(11) NOT NULL,
  nombrePac_ct VARCHAR(30) NOT NULL,
  pesoPac_ct INT(11) NOT NULL,
  sexoPac_ct VARCHAR(10) NOT NULL,
  PRIMARY KEY (id_ct));

CREATE TABLE historiales(
  id_hs INT(11) NOT NULL,
  motivoConsulta_hs VARCHAR(50) NULL DEFAULT NULL,
  antecedentes_hs VARCHAR(100) NULL DEFAULT NULL,
  condicionesPrev_hs VARCHAR(100) NULL DEFAULT NULL,
  pesoPac_hs FLOAT NULL DEFAULT NULL,
  estaturaPac_hs FLOAT NULL DEFAULT NULL,
  ocupacionPac_hs VARCHAR(20) NULL DEFAULT NULL,
  observaciones_hs VARCHAR(150) NULL DEFAULT NULL,
  medicamentos_hs VARCHAR(100) NULL DEFAULT NULL,
  citas_id_ct INT(11) NOT NULL,
  PRIMARY KEY (id_hs), 
  FOREIGN KEY (citas_id_ct));
  