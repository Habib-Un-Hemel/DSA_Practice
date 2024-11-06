public class fibonacci {
    public static int fibo(int n){
        // if (n==0){
        //     return 0 ;
        // }else if(n==1){
        //     return 1;
        // }
        if (n==0 || n==1){
            return n;
        }

        int fibn_1 = fibo(n-1);
        int fibn_2 = fibo(n-2);
        int fib = fibn_1 + fibn_2;
        return fib;
          
    }

    public static void main(String args[]){
        System.out.println(fibo(3));
    }
}
