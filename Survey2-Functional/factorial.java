public class factorial{

    public static void main(String[] args){
        System.out.println(fac(4));
    }

    public static int fac(int n){
        return factorial(n,1);
    }

    public static int factorial(int n, int a){
        int aa = a*n;
        if(n > 2){
            return factorial(n-1, aa);
        }
        else{
            return aa;
        }
    }
}
