# Returns the nth catalan number
def cataNum(n)
    # Returns the value of n choose k
    def binCo(n, k)
        # Returns the factorial of n
        def fact(n)
            if n == 0
                1
            else
                n * fact(n-1)
            end
        end # End fact
        
        fact(n)/(fact(k)*fact(n-k))
    end # End binCo

    ((1 / (n.to_f + 1)) * binCo(2 * n, n)).to_i
end # End cataNum

# printing the catalan number of 0-9
for i in 0..9
    print cataNum(i)
    print "\n"
end
