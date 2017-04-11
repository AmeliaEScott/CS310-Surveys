(defn member [x, lst]
	(cond
		(nil? lst) false
		(= x (first lst)) true
		:else (member x (rest lst))
	)
)