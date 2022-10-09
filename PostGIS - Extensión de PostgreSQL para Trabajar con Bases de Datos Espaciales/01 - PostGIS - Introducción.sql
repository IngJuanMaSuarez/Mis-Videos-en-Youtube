--*********************
-- HABILITAR POSTGIS --
--*********************

-- Enable PostGIS (as of 3.0 contains just geometry/geography)
CREATE EXTENSION postgis;
-- enable raster support (for 3+)
CREATE EXTENSION postgis_raster;
-- Enable Topology
CREATE EXTENSION postgis_topology;
-- Enable PostGIS Advanced 3D
-- and other geoprocessing algorithms
-- sfcgal not available with all distributions
CREATE EXTENSION postgis_sfcgal;
-- fuzzy matching needed for Tiger
CREATE EXTENSION fuzzystrmatch;
-- rule based standardizer
CREATE EXTENSION address_standardizer;
-- example rule data set
CREATE EXTENSION address_standardizer_data_us;
-- Enable US Tiger Geocoder
CREATE EXTENSION postgis_tiger_geocoder;

--*********************
-- ALGUNAS CONSULTAS --
--*********************

-- VER TODOS LOS ATRIBUTOS DE TODOS LOS REGISTROS DE LA TABLA nyc_neighborhoods (BARRIOS)
-- VER TODA LA INFORMACION DE LOS BARRIOS DE NEW YORK
SELECT *
FROM nyc_neighborhoods;

-- VER EL NOMBRE Y LA GEOMETRIA DE LA TABLA nyc_neighborhoods (BARRIOS)
-- VER LOS NOMBRES DE LOS BARRIOS DE NEW YORK Y VISUALIZARLOS EN EL VISOR
SELECT name, geom
FROM nyc_neighborhoods;

-- VER EL NOMBRE Y LA GEOMETRIA DE LA TABLA nyc_neighborhoods (BARRIOS)
-- VER LOS NOMBRES DE LOS BARRIOS DE NEW YORK Y VISUALIZARLOS EN EL VISOR JUNTO CON UN MAPA BASE
SELECT name, ST_Transform(geom, 4326)
FROM nyc_neighborhoods;

-- VER EL NOMBRE DE LOS REGISTROS CUYO boroname (DISTRITO) SEA Brooklyn
-- VER LOS NOMBRES DE LOS BARRIOS DE NEW YORK QUE ESTAN EN EL DISTRITO DE Brooklyn
SELECT name
FROM nyc_neighborhoods
WHERE boroname = 'Brooklyn';

-- VER LOS NOMBRES Y LA GEOMETRIA DE LOS BARRIOS DE NEW YORK QUE ESTAN EN EL DISTRITO DE Brooklyn
-- VER LOS NOMBRES DE LOS BARRIOS DE NEW YORK Y VISUALIZARLOS EN EL VISOR JUNTO CON UN MAPA BASE
SELECT name, ST_Transform(geom, 4326)
FROM nyc_neighborhoods
WHERE boroname = 'Brooklyn';

-- VER TODOS LOS ATRIBUTOS DE TODOS LOS REGISTROS DE LA TABLA nyc_streets (CALLES)
-- VER TODA LA INFORMACION DE LAS CALLES DE NEW YORK
SELECT *
FROM nyc_streets;

-- VER TODOS LOS ATRIBUTOS DE TODOS LOS REGISTROS DE LA TABLA nyc_streets (CALLES)
-- VER LOS NOMBRES DE LAS CALLES DE NEW YORK Y VISUALIZARLAS EN EL VISOR JUNTO CON UN MAPA BASE
SELECT name, ST_Transform(geom, 4326)
FROM nyc_streets;

-- CONTAR LA CANTIDAD DE REGISTROS QUE TIENE LA TABLA nyc_streets
-- CONTAR LA CANTIDAD DE CALLES DE NEW YORK
SELECT Count(*)
FROM nyc_streets;

-- VER TODOS LOS ATRIBUTOS DE TODOS LOS REGISTROS DE LA TABLA nyc_census_blocks (CENSO)
-- VER TODA LA INFORMACION DEL CENSO DE NEW YORK
SELECT *
FROM nyc_census_blocks;

-- SUMAR EL ATRIBUTO popn_total DE LA TABLA nyc_census_blocks FILTRADO POR EL boroname IGUAL A The Bronx
-- SUMAR LA POBLACION TOTAL QUE EXISTE EN EL DISTRITO The Bronx
SELECT SUM(popn_total)
FROM nyc_census_blocks
WHERE boroname = 'The Bronx';

-- CONTAR LA CANTIDAD DE REGISTROS DE LA TABLA nyc_neighborhoods (BARRIOS) AGRUPANDO POR boroname (DISTRITOS)
-- CONTAR LA CANTIDAD DE BARRIOS QUE TIENE CADA DISTRITO
SELECT boroname, Count(*)
FROM nyc_neighborhoods
GROUP BY boroname;