-- CREAR INDICES ESPACIALES
CREATE INDEX municipios_geom_idx
ON municipios
USING GIST (geom);

--- DETERMINE CUAL ES EL DEPARTAMENTO MAS GRANDE O MAS PEQUEÑO ---
SELECT *
FROM departamentos
ORDER BY ST_Area(geom) 
DESC LIMIT 1;

--- CUANTOS MINICIPIOS POR DEPARTAMENTO EXISTEN ---
SELECT departamentos.denombre, Count(*) as numero_municipios
FROM departamentos, municipios
WHERE ST_Contains(departamentos.geom, municipios.geom)
GROUP BY denombre
ORDER BY numero_municipios
DESC;

--- MOSTRAR LOS ESTABLECIMIENTOS EDUCATIVOS DE CUNDINAMARCA ---
SELECT establecimientos_educativos.geom
FROM departamentos, establecimientos_educativos
WHERE departamentos.denombre = 'Cundinamarca'
AND ST_Intersects(departamentos.geom, establecimientos_educativos.geom);

--- CREAR UNA AREA DE INFLUENCIA DE LAS LOCALIDADES ---
SELECT nombre, ST_Buffer(localidades.geom, 1000)
FROM localidades;

--- Departamentos que limitan con Boyacá ---
CREATE TABLE boyaca as 
SELECT *
FROM departamentos
WHERE departamentos.denombre = 'Boyacá';

SELECT departamentos.denombre, departamentos.geom
FROM departamentos, boyaca
WHERE ST_Touches(departamentos.geom, boyaca.geom)