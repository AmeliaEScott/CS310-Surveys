/**
 * Author: Matt Gramlich
 * Reviewer: 
 * language: Prolog
 * Algorithm: lgstar
 * 
 * This prolog file implements the base-2 iterated logarithm lg*(N).
 * 
 * To use, submit the query lgstar(N, Answer) where 'N' is the value
 *  to evaluate. Leaving 'N' uninstantiated results in an error.
 * 
 * You can also use the online swish prolog interpreter at this link:
 * http://swish.swi-prolog.org/p/qfLzdczF.pl
 * 
 */
  
  

pow(_, 0, 1) :- !.
pow(A, B, C) :- BDec is B-1,
    			pow(A, BDec, C1),
    			C is C1*A.

log2(A, D) :-   A > 1, ADiv2 is A/2, 
    			log2(ADiv2, B),	D is B + 1, !.
log2(A, 0) :-   A >= 0 .
    		

lgstar(A, Ans) :-   A >= 1,
    			    log2(A, LgA),
    			    lgstar(LgA, B),
    			    Ans is B + 1, !.
lgstar(A, -1) :-    A < 1 .    
