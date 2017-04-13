-- Function: Fibonacci w/ Tail-Recursion
-- Team: Haskers
-- Author: Ryan Rosier
-- Reviewer:

fac n =
    factorial n 1

factorial x a =
	if x > 1
        then factorial (x-1) (a*x)
        else a

main = print (fac 4)
