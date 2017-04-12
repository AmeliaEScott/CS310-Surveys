-- Function: append
-- Language: haskell	
-- Author: Edwin Velasquez

append list1 list2 = 
	if length list1 == 0 then list2
	else head list1:append (tail list1) list2
	
main = print (append [1, 2, 3] [4, 5, 6])