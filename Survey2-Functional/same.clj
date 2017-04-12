; Function: equalsimp
; Language: Clojure
; Author: Kenneth Redillas
; Team: Haskers


(defn same [list1, list2]
      (cond
      ((empty? list1) (empty? list2))
      ((empty? list2) false)
      ((= (first list1) (first list2))
      	  (same (rest list1) (rest list2)))
	  :else false)
	  )