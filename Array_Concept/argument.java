
//what is the learning 
// 1. array = pass by reference
// 2. revise pass by value and pass by reference


import java.util.*;
public class argument {

    // array as a argument (pass by reference)
    public static void update(int marks[],int unChange){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+3;
        }
        unChange = 100;
        //unchange will change as pass by value 

        System.out.println(unChange);
    }
public static void main (String[] args){
        int marks[] = {84, 92, 53};
        int unChange = 10;

        update(marks,unChange );
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+ " ");  
        }
        System.out.println();
        //unchange will not change
        System.out.println(unChange);

    }
}
