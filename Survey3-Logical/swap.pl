even(A) :- X is A mod 2, X=:=0,!.
odd(A) :- X is A mod 2, X=\=0,!.

swapTraverse(TailLength, TailList, EndList) :- 
    length(TailList, X),
    TailLength =:= X, 
    EndList=TailList, !.
    
swapTraverse(TailLength, TailList, EndList) :- 
    [_|NewTail]=TailList,
    swapTraverse(TailLength, NewTail, EndList).

swap(Before, After) :-
  	length(Before, X),
    even(X),
    TailLength is X/2,
    swapTraverse(TailLength, Before, SecondHalfBefore),
    subtract(Before, SecondHalfBefore, FirstHalfBefore),
    append(SecondHalfBefore, FirstHalfBefore, After), !.

swap(Before, After) :-
  	length(Before, X),
    odd(X),
    append([HeadTemp],Before,AppendedList),
    TailLength is (X+1)/2,
    swapTraverse(TailLength, AppendedList, SecondHalfBefore),
    subtract(Before, SecondHalfBefore, FirstHalfBefore),
    [HeadTemp|ListTemp1]=SecondHalfBefore,
    append(ListTemp1, [HeadTemp], ListTemp2), 
    append(ListTemp2, FirstHalfBefore, After), !.
