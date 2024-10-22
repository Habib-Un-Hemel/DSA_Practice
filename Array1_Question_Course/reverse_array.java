// 2 methods are there || inplace reversal || Out-of-place reversal:
// I will do the best inplace reversal  || tc-> O(n) || sc-> O(1)
import java.util.*;
public class reverse_array {

    public static int reversal(int numbers[]){
        int start = 0;
        int last = numbers.length - 1 ;
        // int end =(start+last)/2;
        //start <= end na karon || same take swap korar mane nai , jeita binery search e lagto
        while (start <= last){
            int temp = numbers[last];
            numbers[last] = numbers[start];
            numbers[start] = temp;

            start++;
            last--;
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,4,5,6,7};
        reversal(numbers);
        for(int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }

    }
    
}
