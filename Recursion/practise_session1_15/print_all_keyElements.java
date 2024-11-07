
public class print_all_keyElements {

    public static int all_occ(int arr[], int key, int i){
        // String str = "";
        if (i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            // str += Integer.toString(i);
            System.out.println(i);
        }
        return all_occ(arr,key,i+1);
        // return  (Integer.valueOf(str)) ;
        
    }
    public static void main(String args[]){
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        all_occ(arr, key ,0);


    }
}
