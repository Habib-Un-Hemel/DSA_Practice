import java.util.*;
public class bubbleSort {

    public static void bubbSort(int arr[]){
        for (int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                //swap
                if(arr[j]>arr[j+1]){
                    // int temp = arr[j];
                    // arr[j]=arr[j+1];
                    // arr[j+1]=temp;
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void print(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]= {5,4,1,3,2};
        bubbSort(arr);
        print(arr);

    }
}
