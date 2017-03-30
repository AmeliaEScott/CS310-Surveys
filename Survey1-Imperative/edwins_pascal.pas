var // establishing variables
    x:integer; // integer variable used for for loop of main function

// function for calculating factorial numbers
function fact(n:real):real; // the return type is a real because pascal will display
begin                       // error if integer is used(arithmetric overflow error). Same for all functions
    if n = 0 then
    begin
        fact:= 1;
    end
    else
    begin
        fact:= n*fact(n-1);
    end;
end;

// function for binomial coefficient
function binCo(n:integer; k:integer):real;
begin
    binCo:= fact(n)/(fact(k)*fact(n-k));
end;

// function for catalan numbers
function cataNum(n:integer):real;
begin
    if n = 0 then
    begin
        cataNum:= binCo(2*n,n);
    end
    else
    begin
        cataNum:= binCo(2*n,n)-binCo(2*n, n-1);
    end;
end;


begin // beginning of main program
    for x:=0 to 9 do
    begin
        writeln(cataNum(x));
    end;
end. // end of program
