import java.util.*;
public class pairs_in_array {

    public static void printPairs(int numbers[]){
        for (int i=0; i< numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int pair = numbers[i] + numbers[j];
                System.out.println(pair);
            }
            System.out.println();
        }

    }




    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        printPairs(numbers);

    }
}