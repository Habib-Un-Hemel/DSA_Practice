import java.util.*;

public class selectionSort {

    public static void selection_Sort( int arr[]){
        //outer loop is for turns || n-2
        for(int i=0; i <arr.length-1;i++){
            int minPos = i;
            //j=i+1 is for last unsorted arrary
            for(int j=i+1;j<arr.length-1;j++){
                if (arr[minPos]>arr[j]){
                    minPos = j;
                }  
            }
            df

        }
    }
    public static void main(String args[]){
        int arr[]={4,5,1,3,2};
    }
}
