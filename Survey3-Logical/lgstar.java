 

public class lgstar{

	// Equivalent of prolog rule which unifies one variable to be the log star of the other
	public static int lgstar(double x){
		if(x <= 1){
			return 0;
		}else{
			// Base conversion to base 2
			return 1 + lgstar(Math.log(x) / Math.log(2.0));
		}
	}

	// Equivalent of the prolog rule which gives Yes if one input is the lgstar of the other
	public static boolean lgstar(double x, int i){
		return lgstar(x) == i;
	}

	// If 1 command line argument, it calculates the log star.
	// If 2 command line arguments, it decides whether the second argument is equal
	// to the log star of the first.
	public static void main(String[] args){
		if(args.length == 0){
			System.out.println("1 or 2 command line arguments expected.");
		}else if(args.length == 1){
			System.out.println(lgstar(Double.parseDouble(args[0])));
		}else{
			System.out.println(lgstar(Double.parseDouble(args[0]), Integer.parseInt(args[1])));
		}
	}
}