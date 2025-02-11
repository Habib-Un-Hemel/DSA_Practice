import java.util.*;

public class c_unionOFTwoArray{

    static void unionArr(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i< arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println(set);
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,4};
        int arr2[]= {2,3,4,2,7,8,9};
        unionArr(arr1,arr2);

    }
}