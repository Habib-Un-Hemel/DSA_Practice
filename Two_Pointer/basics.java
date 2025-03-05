import java.util.*;

public class basics {
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

    static void sortZeroAndOnes(int arr[]) {
        int n = arr.length;
        int countZero = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                countZero++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i < countZero) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    static void twoPointerApproach(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);

        System.out.println("Give the array size:");
        int n = sc.nextInt();  

        int arr[] = new int[n]; 
        System.out.println("Give the array elements:");
        for (int i = 0; i < n; i++) {  
            arr[i] = sc.nextInt();  
        } // **← Moved this bracket here**

        System.out.println("Original array:");
        printArray(arr);

        // sortZeroAndOnes(arr);
        // System.out.println("sorted arr");
        // printArray(arr);

        twoPointerApproach(arr);
        System.out.println("Sorted array:");
        printArray(arr);

    }
}
