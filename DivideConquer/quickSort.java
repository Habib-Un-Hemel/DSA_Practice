import java.util.*;
public class quickSort {
    public static void printArr(int arr[]){
        for( int i=0; i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[],int low, int high){
        if(low < high){
            int partition_index = partition_function( arr,low,high);
            quickSort(arr, low, partition_index -1 );
            quickSort(arr,partition_index + 1, high);
        }
    }
    public static int partition_function(int arr[],int low, int high){
        int pivort =  arr[low];
        int i = low;
        int j= high;
        while (i<j){ 
            while (arr[i]<= pivort && i<= high -1 ){
                i++ ;
            }
            while (arr[j] > pivort && j >= low + 1 ){
                j-- ;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }  
                int temp2 = arr[low];
                arr[low] = arr[j];
                arr[j]= temp2;        
        } 
        return j;

    }
    public static void main(String args[]){
        int arr[] = {9, 6, 1,-2,0};
        quickSort(arr, 0, arr.length -1);
        printArr(arr);
    }
}


