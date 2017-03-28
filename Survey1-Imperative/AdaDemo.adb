-----------------------------------------------------------
-- CS 310
-- Team Haskers
-----------------------------------------------------------
with Ada.Text_Io;
use Ada.Text_Io;

procedure AdaDemo is
    -- In Ada, nested functions must be declared before the body of the function in
    -- which they are nested. That is, before the "begin" of the parent function.
  function Catalan(N : Long_Integer) return Long_Integer is
      function BinomialCoeff(N : Long_Integer; K : Long_Integer) return Long_Integer is
        -- Long integers were used because, when an Ada integer overflows, rather
        -- than wrapping around like in the C family of languages, it causes an error
        -- and crashes the program.
        -- Also, these numbers tend to get large very quickly, so even if it didn't
        -- crash, it would give incorrect answers.
        function Factorial(N : Long_Integer) return Long_Integer is
        begin -- Begin Factorial()
          if N <= 1 then
            return 1;
          else
            return N * Factorial(N - 1);
          end if;
        end Factorial;
      begin -- Begin BinomialCoeff
        return Factorial(N) / (Factorial(K) * Factorial(N - K));
      end BinomialCoeff;
    begin -- Begin Catalan
        -- Ada does not have implicit type casting, so to, for eample, multiply a float
        -- by an integer, you have to explicitly type cast one or the other.
        return Long_Integer((1.0 / (Float(N) + 1.0)) * Float(BinomialCoeff(2 * N, N)));
    --return 1;
    end Catalan;
begin -- Begin AdaDemo (Main function)
    for Num in 0..9 loop
        -- In Java, you could say something like Integer.toString(5)
        -- Ada uses apostrophes instead of dots, and the function is named differently,
        -- so the equivalent is Integer'Image(5)
        -- (Or, in this case, Long_Integer'Image(...))
      Put_Line("Catalan number " & Integer'Image(Num) & " is " 
        & Long_Integer'Image(Catalan(Long_Integer(Num))));
    end loop;
end AdaDemo;