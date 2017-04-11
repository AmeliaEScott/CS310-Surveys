; Function: member
; Language: Clojure
; Author: Timothy Scott
; Team: Haskers

(defn member [x, lst]
	(cond
		(empty? lst) false
		(= x (first lst)) true
		:else (member x (rest lst))
	)
)