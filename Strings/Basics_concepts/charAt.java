import java.util.*;
public class charAt {

    public static void printLetter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i)+" ");
        }
    }
    public static void main (String args[]){
        String str ;
        str = "Riha";
        System.out.println(str.charAt(0));
        printLetter(str);
    }
}
