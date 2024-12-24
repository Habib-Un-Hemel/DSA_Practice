package ArrayList;
import java.util.*;
public class size_function {
    
    // .length is  a property of array
    // list.size() size is method here
public static void main(String[] args) {
    
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(3);
    list.add(5);
    list.add(16);
    list.add(199);

    System.out.println(list);
    System.out.println(list.size());

    for(int i=0; i< list.size(); i++){
        System.out.print(list.get(i)+ " ");
    }
     System.out.println();
    System.out.println("program over");
}
}