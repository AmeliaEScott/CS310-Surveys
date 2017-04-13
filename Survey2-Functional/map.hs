-- Function map
-- Team: Haskers
-- Author: Matt Gramlich
-- Reviewer: Edwin Velasquez

mul2 n =
	n * 2
	
mapFunc func list =
	[ func val | val <- list ]
	
main = print(mapFunc mul2 [2,2])
