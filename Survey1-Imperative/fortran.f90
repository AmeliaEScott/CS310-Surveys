PROGRAM fortran
    IMPLICIT NONE
    INTEGER cat
    INTEGER I

    ! 10 is the loop label, which has to be a number
    do 10 I = 0, 9
        PRINT *, 'Catalan number ', I, ' is ', cat(I)
    10 CONTINUE


END PROGRAM fortran

INTEGER FUNCTION cat(N)
    INTEGER N

    ! Like Ada, Fortran has no implicit type casting
    ! INT(x, 8) casts x to an integer of 8 bytes (AKA, a long)
    cat = INT((1 / (FLOAT(N) + 1)) * FLOAT(binom(INT(2 * N, 8), INT(N, 8))))

    ! Contains is how to specify nested functions
    CONTAINS
    INTEGER(kind=8) FUNCTION binom(A, K)
        INTEGER(kind=8) A, K
        binom = fac(A) / (fac(A - K) * fac(K))
    END FUNCTION binom

    ! Fortran does not allow functions to be nested more than 1 layer deep,
    ! so the factorial function cannot be inside the binomial function
    RECURSIVE FUNCTION fac(F) result(R)
        INTEGER(kind=8) F, R
        IF (F < 2) THEN
            R = 1
        ELSE
            R = F * fac(F - 1)
        END IF
    END FUNCTION fac
END FUNCTION cat