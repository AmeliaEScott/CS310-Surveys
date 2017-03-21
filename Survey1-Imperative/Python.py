def CatalanNumber(n):
    def BinomialCoefficient(n, k):
        def Factorial(n):
            if n <= 1:
                return 1
            else:
                return n*Factorial(n-1)
        return (Factorial(n))/(Factorial(k) * Factorial(n - k))
    return (1.0 / float(n + 1)) * float(BinomialCoefficient(2*n, n))

for i in range(10):
    print "Catalan number %d is: %d" %(i, CatalanNumber(i))

