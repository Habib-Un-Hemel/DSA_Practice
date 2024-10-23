import java.util.*;

public class print_sum_subarray {
    public static void printSumSubarr(int numbers[]){
        for (int i=0; i<numbers.length;i++){
            int start = i;
            for (int j= i;j<numbers.length;j++){
                int end = j;
                int sum = 0;//its important otherwise you will get a total sum from the beginning 
                for (int k = start; k<=end;k++){
                        sum += numbers[k];
                    }System.out.println(sum);

            }
    }
}
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        printSumSubarr(numbers);
    }

}
