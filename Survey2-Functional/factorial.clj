;Factorial w/ Tail-Recursion
;Team: Haskers
;Author: Ryan Rosier
;Reviewer:

(defn fact [n, a]
    (cond (> n 1)
        (fact (- n 1) (* a n))
        :else a
    )
)

(print (fact 4 1))
