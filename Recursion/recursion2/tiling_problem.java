// amazon asked many times
public class tiling_problem {

    public static int tilingProblem(int n){
        if (n==0 || n==1){
            return 1;
        }
        //vertical choice
        int way1= tilingProblem(n-1);

        //horizontal choice 
        int way2= tilingProblem(n-2);
        int all_ways = way1 + way2;

        return all_ways;


    }
    public static void main(String args[]){
        System.out.print(tilingProblem(10));
    }
}
