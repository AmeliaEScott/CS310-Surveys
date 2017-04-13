-- Function: equalsimp
-- Language: Haskell
-- Author: Kenneth Redillas
-- Team: Haskers

same list1 list2 =
     if (length list1 == 0) && (length list2 == 0) then True
     else if length list2 == 0 then False
     else if (head list1) == (head list2)
     	  then same (tail list1) (tail list2)
     else False

main = print (same ([1, 2, 3]) ([1, 2, 3]))
	