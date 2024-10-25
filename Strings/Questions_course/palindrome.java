import java.util.*;
public class palindrome {
    public static void check_palindrome(String name){
        boolean flag = true;
        for (int i=0; i<name.length()/2;i++){
            //its important that you are considering , one not matching pair
            //dont go for ==
            if (name.charAt(i) != name.charAt(name.length()-i-1)){
                flag = false;
                break;
            }
        }
        if(flag ==true){
            System.out.println("The word is  Palindrome");
        }else{
            System.out.println("The word is not Palindrome");

        }
    }
    public static void main(String args[]){
        String name = "noon";
        check_palindrome(name);
    }
}
