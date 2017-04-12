-- Function: Fibonacci w/ Tail-Recursion
-- Team: Haskers
-- Author: Ryan Rosier
-- Reviewer:

fib n =
    fibo n 0 1

fibo x a b =
	if x > 0
        then fibo (x-1) b (a+b)
        else a

main = print (fib 7)
