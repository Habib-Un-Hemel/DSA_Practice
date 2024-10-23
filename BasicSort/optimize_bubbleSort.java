//best case: 1,2,3,4,5 || but normal bubble sort will take O(n^2) even in the best case so 
//we have introduce the optimize the bubbleSort || if any turns with 0 swap occurs then break will happen
// O(N)


import java.util.*;
public class optimize_bubbleSort {
    public static void bubbSort(int arr[]){
        //n-1 turns
        for(int turn=0;turn<arr.length-1;turn++){
            int swap=0;
            for(int j=0; j<arr.length-1-turn;j++){
                //swap
                if (arr[j]>arr[j+1]){
                int temp = arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                swap++;
                }   
            }if(swap ==0){
                System.out.println("sorted already!");
                break;
            }
        }


    }


    public static void print(int arr[]){
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        // int arr[]={5,4,1,3,2};
        int arr[]={1,2,3,4};
        bubbSort(arr);
        print(arr);
    }
}
