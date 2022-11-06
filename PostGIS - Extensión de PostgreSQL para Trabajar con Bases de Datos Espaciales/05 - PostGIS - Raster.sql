SELECT 
	ST_Height(rast) as num_filas,
	ST_Width(rast) as num_columnas,
	ST_SRID(rast) as sistema_referencia,
	ST_Numbands(rast) as numero_bandas
FROM chia

SELECT *
FROM raster_columns