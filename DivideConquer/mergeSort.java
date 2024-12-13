import java.util.*;
public class mergeSort {
    public static void printArr(int arr[]){
        for( int i=0; i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int low, int high){
        if (low>=high){
           return;
        }
        int mid = (low + high)/2; // start + (end - start)/2
        mergeSort(arr, low, mid); //left side sorted
        mergeSort(arr, mid+1, high); //right side sorted
        merge(arr,low,mid, high); // left sorted and right sorted , now merge them
    }
    public static void merge(int arr[], int low,int mid,int high){
        //left(0,3) = 4 ta , right(4,6)=3ta -> 6-0+1 = 
        int temp[]= new int[high -low +1];    // merge eitai 
        int i = low;
        int j = mid+1;
        int k = 0; 
        while(i<=mid && j <=high){
            if (arr[i]<arr[j]){
                temp[k] = arr[i];
                i ++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
            // System.out.println("temp");
            // printArr(temp);
            // System.out.println("arr");
            // printArr(arr);
        }
        while (i<=mid){
            //k er same value nibe then increment 
            temp[k++] = arr[i++];
        }
        while (j<=high){
            temp[k++] = arr[j++];
        }
            // System.out.println("temp2");
            // printArr(temp);
            // System.out.println("arr2");
            // printArr(arr);
            
        for (k=0,i=low;k<temp.length;k++,i++){
            arr[i] =temp[k];
        }
            // System.out.println("temp3");
            // printArr(temp);
            // System.out.println("arr3");
            // printArr(arr);
    }
    public static void main(String args[]){
        int arr[] = {9, 6, 1,-2,0};
        //printArr(arr);
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}


