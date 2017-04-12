-- Function: equalsimp
-- Language: Haskell
-- Author: Kenneth Redillas
-- Team: Haskers

same list1 list2 =
     if (length list1 == 0) && (length list2 == 0) then true
     else if length list2 == 0 then false
     else if (head list1) == (head list2)
     	  then same (tail list1) (tail list2)
     else false

main = same ([1, 2, 3]) ([3, 2, 1])
	