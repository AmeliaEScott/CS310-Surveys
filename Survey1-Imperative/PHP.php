<?php
/*
 * CS 310 - Survey #1
 * Team: Haskers
 * Author: Ryan Rosier
 * Reviewer:
 */

//Below is a for loop to test the catalan function for inputs 1 through 10
for($t=1; $t<11; $t++){
    echo "Catalan number ";
    echo $t;
    echo " is ";
    echo catalanNumber($t);
}

//Below is the catalan function that returns  1/n+1 times the binomial coefficient
function catalanNumber($n){
    echo "test1";
    return (1/($n+1))*binomialCoefficient(2*$n,$n);

    //Below is the binomial coefficient function that return j!/(k!*(j-k)!)
    function binomialCoefficient($j,$k){
        echo "test2";
        return factorial($j)/(factorial($k)*factorial($j-$k));

        //Below is the factorial function that recursively finds i!
        function factorial($i){
            echo "test3";
            if($i<2){
                return 1;
            }
            else{
                return $i*factorial($i--);
            }
        }//end factorial()
        echo "test4";
    }//end binomailCoefficient
}//end catalanNumber
?>
