import java.util.*;

public class linear_search2 {

    public static int linearSearch(String menu[],String food){
        for(int i=0; i< menu.length; i++){
            if(menu[i]== food){
                return i;
            }
        }
        return -1; 

    }
    public static void main(String args[]){
        String menu[]={"egg", "meat", "banana", "peanut butter"};
        String food = "meat";

        int index = linearSearch(menu, food);
        if (index == -1){
            System.out.println("food is not there");
        }else{
            System.out.println("food is in "+ index);

        }
    }
}
