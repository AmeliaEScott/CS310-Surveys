public class fib{

    public static void main(String[] args){
        System.out.println(fib(5));
    }

    public static int fib(int n){
        return fibo(n,0,1);
    }

    public static int fibo(int n, int a, int b){
        int tmp = a+b;
        if(n > 2){
            int aa = b;
            int bb = tmp;
            return fibo(n-1, aa, bb);
        }
        else{
            return tmp;
        }
    }
}
