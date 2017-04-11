member x lst =
	if length lst == 0 then False
	else if head lst == x then True
	else member x (tail lst)

main = print (member 7 [1, 2, 3, 4, 5])