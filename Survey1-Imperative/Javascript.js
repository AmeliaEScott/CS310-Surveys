/*
CS310 Survey 1 - Imperative languages
Team: Haskers
Author: Timothy Scott
Reviewer: Kenneth Redillas
*/

//"Main method" starts here:
for(var i = 0; i < 10; i++){
    console.log("Catalan number " + i + " is " + catalan(i));
}


//Actual functions start here
function catalan(n){

    return (1 / (n + 1)) * binomialCoeff(2*n, n);

    function binomialCoeff(n, k){
        // Within this nested function, "n" refers to the parameter of binomialCoeff()
        // "n" does NOT refer to the parameter of catalan()
        return factorial(n) / (factorial(k) * factorial(n - k));

        function factorial(n){
            // Similarly, within here, "n" refers to the parameter of factorial()
            if(n <= 1){
                // 0! is 1
                return 1;
            }else{
                return n * factorial(n - 1);
            }
        }
    }
}