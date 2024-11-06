import java.util.*;
public class first_occurence {

    public static int check_first_occ(int arr[],int i, int key){
        if(i == arr.length){ // arr crossed side case firstly i wrote i==arr.length -1 
            return -1;
        }
        if( arr[i] == key){
            return i;
        }
        return check_first_occ(arr, i+1, key);
    };


    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,7}; // length = 9
        int key = 7;
        System.out.println(check_first_occ(arr,0,key));
    }
}


// tc O(n)
//sc O(n)