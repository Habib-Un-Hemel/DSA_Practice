
public class last_occurence {

    public static int check_last_occ(int arr[],int i, int key){
        if(i == arr.length){ // arr crossed side case firstly i wrote i==arr.length -1 
            return -1;
        }
        int isfound = check_last_occ(arr, i+1, key); //isfound is for make a iteration to the last then start to compare from the last
        
        if ( isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
       
    };


    public static void main(String args[]){
        int arr[] = {2,3,6,9,5,10,5,7}; // length = 9
        int key = 2;
        System.out.println(check_last_occ(arr,0,key));
    }

    
}

//https://pythontutor.com/render.html#mode=display check the simulation