;Fibonacci w/ Tail-Recursion
;Team: Haskers
;Author: Ryan Rosier
;Reviewer:

(defn fibo [n, a, b]
    (cond (> n 0)
        (fibo (- n 1) b (+ a b))
        :else a
    )
)

(print (fibo 6 0 1))
