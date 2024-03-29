<?php
/*
 * CS 310 - Survey #1
 * Team: Haskers
 * Author: Ryan Rosier
 * Reviewer: Timothy Scott
 */

//Below is a for loop to test the catalan function for inputs 1 through 10
for($t=0; $t<11; $t++){
    echo "Catalan number ";
    echo $t;
    echo " is ";
    echo catalanNumber($t);
    echo "\n";
}
//Below is the catalan function that returns  1/n+1 times 2n choose n
function catalanNumber($n){
    //Below is the binomial coefficient function that return j!/(k!*(j-k)!)
    $binomialCoefficient = function($j,$k){

        //Below is the factorial function that recursively finds i!
        $factorial = function($i) use (&$factorial){
            if($i<2){
                return 1;
            }
            else{
                return $factorial($i-1)*$i;
            }
        };//end factorial()
        return $factorial($j)/($factorial($k)*$factorial($j-$k));
    };//end binomailCoefficient
    return (1/($n+1))*$binomialCoefficient(2*$n,$n);
}//end catalanNumber
?>
