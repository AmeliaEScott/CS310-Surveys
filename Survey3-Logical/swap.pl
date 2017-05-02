/**
 * Author: Matt Gramlich, Kenneth Redillas
 * language: Prolog
 * Algorithm: swap
 * 
 * This prolog file implements the swap. 
 * Not having a list as either of the arguments will throw
 * an instantiation error.
 * 
 * Example Query: 'swap([1,2,3],Answer).'
 * 
 * You can use the online swish prolog interpreter at this link:
 * http://swish.swi-prolog.org/p/CS310%20Swap.pl
 * 
 */

odd(A) :- X is A mod 2, X=\=0,!.

split([], [], [], [], _).

split([Head | List], First, Middle, Last, Length) :-
    odd(Length),
    length(List, ListLength),
    Mid is div(Length, 2),
    ListLength =:= Mid,
    split(List, First, RecurMiddle, Last, Length),
    append([Head], RecurMiddle, Middle).

split([Head | List], First, Middle, Last, Length) :-
    length(List, ListLength),
    ListLength >= Length / 2,
    split(List, RecurFirst, Middle, Last, Length),
    append([Head], RecurFirst, First).

split([Head | List], First, Middle, Last, Length) :-
    length(List, ListLength),
    ListLength < Length / 2,
    split(List, First, Middle, RecurLast, Length),
    append([Head], RecurLast, Last).

swap(Before, After) :-
    (   
    	(not((is_list(Before); is_list(After)))->
    		instantiation_error(_)); true
    ),
    length(Before, ListLength),
    split(Before, First, Middle, Last, ListLength),
    append(Last, Middle, Intermediate),
    append(Intermediate, First, After), !.
