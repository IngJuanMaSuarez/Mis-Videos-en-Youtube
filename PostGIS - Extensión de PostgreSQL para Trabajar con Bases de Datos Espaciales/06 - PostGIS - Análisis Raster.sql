CREATE TABLE ndvi as (
	SELECT ST_MapAlgebra(
		chia.rast, 4, chia.rast, 3,
		'(([rast1.val]-[rast2.val])/([rast1.val]+[rast2.val]))',
		'32BF'
	)
	FROM chia
)

CREATE TABLE ndwi as (
	SELECT ST_MapAlgebra(
		chia.rast, 2, chia.rast, 4,
		'(([rast1.val]-[rast2.val])/([rast1.val]+[rast2.val]))',
		'32BF'
	)
	FROM chia
)