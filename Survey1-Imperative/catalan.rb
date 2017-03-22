# this method returns the factorial of n
def fact(n)
	if n == 0
		1
	else
		n * fact(n-1)
	end
end

=begin this method returns the binomial coefficient, 
commonly known as n choose k or combination, 
=end of n and k
def binCo(n, k)
	fact(n)/(fact(k)*fact(n-k))
end

# this method prints the catalan number of n
def cataNum(n)
	fact(2*n)/(fact(n+1)*fact(n))
end

# printing the catalan number of 0-9
for i in 0..9
	print cataNum(i)
	print "\n"
end