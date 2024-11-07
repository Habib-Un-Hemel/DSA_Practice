package Recursion.Basics;

public class power {
    public static int powerTo(int x,int n){

        if (n==0){
            return 1;
        }

        // int xnm1 = powerTo(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * powerTo(x, n-1);
    }
    public static void main(String args[]){
        System.out.println(powerTo(2, 5));
    }
}
