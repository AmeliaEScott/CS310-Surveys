;; Function: map
;; Language: Clojure
;; Author: Matt Gramlich

(defn testfunc [a] (* a a) )
 
(defn mapFunc [fun v] 
  (cons (fun (first v))
	  (if (not (empty? (subvec v 1))) 
		(mapFunc fun (subvec v 1))
	   )
   )
)

(print (mapFunc testfunc [3 1 2 5]) )
