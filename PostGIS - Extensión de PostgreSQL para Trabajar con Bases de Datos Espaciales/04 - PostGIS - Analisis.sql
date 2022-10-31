--Se necesita construir un nuevo colegio de primaria en el pueblo, para ello es necesario comprar una manzana completa que cumpla las siguientes características:
-- Debe tener un área de más de 5000 metros cuadrados
-- No debe quedar a menos de 300 metros de otro colegio de primaria
-- No debe quedar a menos de 200 metros de cualquier tipo de equipamiento
-- La manzana completa debe quedar en una zona exclusivamente residencial

-- PASO 1

SELECT *
FROM manzanas
-- 124 registros

CREATE TABLE manzanas_5000 as
SELECT *
FROM manzanas
WHERE ST_Area(manzanas.geom) > 5000
-- 60 registros

-- PASO 2

CREATE TABLE buffer_colegios_primaria as
SELECT ST_Union(ST_Buffer(colegios.geom, 300)) as geom
FROM colegios
WHERE categoria = 'Primaria'

CREATE TABLE manzanas_alejadas as
SELECT manzanas_5000.*
FROM manzanas_5000, buffer_colegios_primaria
WHERE ST_Intersects(manzanas_5000.geom, buffer_colegios_primaria.geom) = false
-- 38 registros

-- PASO 3

CREATE TABLE buffer_equipamientos as
SELECT ST_Union(ST_Buffer(equipamientos.geom, 200)) as geom
FROM equipamientos

CREATE TABLE manzanas_alejadastotal as
SELECT manzanas_alejadas.*
FROM manzanas_alejadas, buffer_equipamientos
WHERE ST_Intersects(manzanas_alejadas.geom, buffer_equipamientos.geom) = false
-- 29 registros

-- PASO 4
CREATE TABLE suelo_residencial as
SELECT ST_Union(usodelsuelo.geom) as geom
FROM usodelsuelo
WHERE usodelsuelo.tipo_uso = 'RESIDENCIAL'

SELECT manzanas_alejadastotal.*
FROM manzanas_alejadastotal, suelo_residencial
WHERE ST_Contains(suelo_residencial.geom, manzanas_alejadastotal.geom)
-- 2 registros