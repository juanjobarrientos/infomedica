CREATE DATABASE infomedica;

USE infomedica;

CREATE TABLE usuarios (
    id_us INT(10) AUTO_INCREMENT NOT NULL,
    username_us VARCHAR(20)NOT NULL,
    password VARCHAR(20)NOT NULL,
    fullname_us VARCHAR(40)NOT NULL,
    email_us VARCHAR(30)NOT NULL,
    celular_us INT (10)NOT NULL,
    documento_us INT(10)NOT NULL,
    tipousuario VARCHAR(10)NOT NULL,
    estado_us VARCHAR(10)NOT NULL,
    created_at timestamp NOT NULL DEFAULT current_timestamp
);
ALTER TABLE usuarios
  ADD PRIMARY KEY (documento_us);

CREATE TABLE especialidad_medica (
    id INT(10) AUTO_INCREMENT NOT NULL,
    medicoid INT(10)NOT NULL,
    descripcion VARCHAR(100) NOT NULL,
    created_at timestamp NOT NULL DEFAULT current_timestamp,
    CONSTRAINT fk_medicoid FOREIGN KEY(medicoid) REFERENCES usuarios(documento_us)
);
ALTER TABLE especialidad_medica
  ADD PRIMARY KEY (id);
CREATE TABLE citas (
   id_ct INT(10) AUTO_INCREMENT NOT NULL,
   id_pc INT (10)NOT NULL,
   id_m INT (10)NOT NULL,
   fecha_ct DATE NOT NULL,
   hora_ct NOT NULL,
   edad_ct INT(2) NOT NULL,
   created_at timestamp NOT NULL DEFAULT current_timestamp,
   CONSTRAINT fk_id_pc FOREIGN KEY(id_pc) REFERENCES usuarios(documento_us),
   CONSTRAINT fk_id_m  FOREIGN KEY(id_m) REFERENCES usuarios(documento_us)

);
ALTER TABLE citas
  ADD PRIMARY KEY (id_ct);

CREATE TABLE historial(
    id_hs INT(10) AUTO_INCREMENT NOT NULL,
    id_pc INT (10)NOT NULL,
    id_m INT (10)NOT NULL,
    id_ct INT (10)NOT NULL,
    motsivo_consulta_hs VARCHAR(50)NOT NULL,
    condicionesPre_hs VARCHAR(100)NOT NULL,
    antecendentes_hs VARCHAR(100)NOT NULL,
    pesoPac_hs FLOAT NOT NULL,
    estaturaPac_hs FLOAT NOT NULL,
    ocupacionPac_hs VARCHAR(20)NOT NULL,
    observacionesPas_hs VARCHAR(150)NOT NULL,
    medicamentos_hs VARCHAR(100)NOT NULL,
    created_at timestamp NOT NULL DEFAULT current_timestamp,
    CONSTRAINT fk_id_m FOREIGN KEY(id_m) REFERENCES usuarios(documento_us),
    CONSTRAINT fk_id_pc FOREIGN KEY(id_pc) REFERENCES usuarios(documento_us),
    CONSTRAINT fk_id_ct FOREIGN KEY(id_ct) REFERENCES citas(id_ct)
   );


   ALTER TABLE historial
  ADD PRIMARY KEY (id_hs);
