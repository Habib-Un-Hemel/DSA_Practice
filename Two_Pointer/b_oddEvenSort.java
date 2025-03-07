// """given an array of integers 'a', move all the even integers at the beginning of the array followed by all the odd integers.
//     the relative order of odd and even integers does not matter. return the any array that satisfies the condition
// """



import java.util.*;
public class b_oddEvenSort {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sortOddEven(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            if(arr[left]%2!=0 && arr[right]%2==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
            }
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the array size:");
        int n = sc.nextInt();  
        int arr[] = new int[n]; 
        System.out.println("Give the array elements:");
        for (int i = 0; i < n; i++) {  
            arr[i] = sc.nextInt();  
        } 

        System.out.println("Original array:");
        printArray(arr);

        sortOddEven(arr);
        System.out.println("Sorted Array:");
        printArray(arr);


    }

}

