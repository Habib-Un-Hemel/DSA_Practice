import java.util.*;
public class c_square {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    static int[] square(int arr[]){
        int n = arr.length;
        int left  = 0;
        int right = n - 1;
        int[] arr2 = new int[n];
        int k = n-1;

        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                arr2[k] = arr[left] * arr[left];
                                                // arr2[k++] = arr[left] * arr[left];
                left++;
                k--;
            }
            else{
                arr2[k]=arr[right] * arr[right];
                right--;
                k--;
            }

        }
        return arr2;
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

        int[] ans = square(arr);
        System.out.println("Sorted Array:");
        printArray(ans);
        


    }

}

