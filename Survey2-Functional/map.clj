;; Function: map
;; Language: Clojure
;; Author: Matt Gramlich

(defn testfunc [a] (* a a) )
 
(defn mapFunc [fun v] 
  (cons (fun (first v))
	  (if (not (empty? (rest v))) 
		(mapFunc fun (rest v))
	   )
   )
)

(print (mapFunc testfunc [3 1 2 5]) )
