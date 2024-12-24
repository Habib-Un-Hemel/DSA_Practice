package ArrayList;
import java.util.*;

public class arrayList_basic {
    public static void main(String args[]){
        //className ObjectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1); //0(1)
        list.add(10); 
        list.add(100);
        list.add(1000);
        list.add(1,9); //0(n)

        int got = list.get(2);
        list.remove(3);
        list.set(2,514);

        System.out.println(list.contains(10));

        System.out.println(list);
        System.out.println(got);
    }
}
