(defn member [x, lst]
	(cond
		(empty? lst) false
		(= x (first lst)) true
		:else (member x (rest lst))
	)
)