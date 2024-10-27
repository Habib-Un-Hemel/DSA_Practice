import java.util.*;

public class equals_function {
    public static void main(String args[]){
    String name = "Rihu";
    String name2 = "Rihu";
    String name3 = new String("Rihu");
    
    if(name == name2){
        System.out.println("same");
    }else{
        System.out.println("not same");
    }
    if(name == name3){
        System.out.println("same");
    }else{
        System.out.println("not same");
    }

    if(name.equals(name2)){
        System.out.println("equal = same");
    }else{
        System.out.println("equal = not same");
    }
    if(name.equals(name3)){
        System.out.println("equal = same");
    }else{
        System.out.println("equal = not same");
    }


    
    }

    

}
