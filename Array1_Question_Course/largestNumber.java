import java.util.*;
public class largestNumber {
    public static int largest_number(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]>largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {1,3,4,6,9,11, 2};
        int no = largest_number(numbers);
        System.out.println(no);

    }
}
