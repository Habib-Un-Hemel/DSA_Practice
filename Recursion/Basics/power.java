package Recursion.Basics;

public class power {
    public static int powerTo(int x,int n){

        if (n==0){
            return 1;
        }

        // int xnm1 = powerTo(x, n-1);
        // int xn = x * xnm1;
        // return xn;
        //O(n)

        return x * powerTo(x, n-1);
    }

    public static int optimized_powerTo(int x,int n){

    if (n==0){
        return 1;
    }

    // int halfPowerSQ =  optimized_powerTo(x,n/2) * optimized_powerTo(x,n/2);
    // if (n %2 ==0){
    //     return halfPower;
    // }else{
    //     return x * halfPower;
    // }
    // }
    // //O (n)

    int halfPower =  optimized_powerTo(x,n/2);
    int halfPowerSq = halfPower * halfPower;
    if (n %2 ==0){
        return halfPowerSq;
    }else{
        return x * halfPowerSq;
    }
    }
    //O (logn) akber recursion call 





    public static void main(String args[]){
        System.out.println(powerTo(2, 5));
        System.out.println(optimized_powerTo(2, 10));

    }
}

