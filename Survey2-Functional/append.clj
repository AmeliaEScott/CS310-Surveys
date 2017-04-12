;; Function: append
;; Language: Closure
;; Author: Edwin Velasquez

(defn append [list1, list2] 
	(if (empty? list1) list2 (cons (first list1) (append (rest list1) list2)))
)