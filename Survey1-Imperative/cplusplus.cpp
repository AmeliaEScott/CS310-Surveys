/* 
 * File:   cs310-survey1-cpp.cpp
 * Author: mattG
 *
 * Created on March 16, 2017, 11:36 AM
 * 
 * @brief The following program calculates the Catalan numbers C_0 -> C_9 
 * 
 * TO COMPILE: g++ cs310-survey1-cpp.cpp -o cs310-survey1-cpp
 * 
 */

#include <cstdio>

/**
 * @brief create the standard type redirection. This structure overloads
 *          the () operator which returns the C_nth Catalan value
 */
typedef struct s_catalan catalan_t;
struct s_catalan
{
    /**
     * @brief defines a nested structure which overloads the () operator. No Type
     *          redirection required as function use is internal to the parent structure.
     *          The () operator takes 2 long long integers and calculates the 
     *          value of the binomial coefficient. 
     */
    struct s_binomialCoefficient
    {
        /**
         * @brief defines a nested structure which overloads the () operator. No Type
         *          redirection required as function use is internal to the parent
         *          structure. The () operator takes 1 long long integer and calculates
         *          the factorial of the value recursively. 
         */
        struct s_factorial
        {
            long long int operator()(long long int n)
            {
                if(!n){ return 1; }         //recursion base case: if the input is 0, return 1
                struct s_factorial fact;        //construct new factorial struct
                return n*fact(n-1);             //use the fact struct () operator to return factorial
            }
        };
        long long int operator()(long long int n, long long int k)
        {
            struct s_factorial fact;                    //create new factorial structure
            return (fact(n))/(fact(k)*fact(n-k));       //calculate factorials and return binomial
                                                            //coefficient value
        }
    };
    long long int operator()(long long int n)
    {
        if(n<0){ return 0; }
        struct s_binomialCoefficient binomialCoeff;     //create new binomial coefficient structure
        return (long long int)                          //due to intermediate calculations
            (1.0/((double)n+1.0)*                       //rounding down to integer division,
                (double)binomialCoeff(2*n,n));          //intermediate calculations are performed as doubles
    }
};

int main(int argc, char** argv) {

    catalan_t myCatalan;
    for(int i = 0; i < 10; i++)
    {
        std::printf("C_%d : %d\r\n", i , myCatalan(i));
    }
    
    return 0;
}

