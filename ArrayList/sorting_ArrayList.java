package ArrayList;

import java.util.*;
    // import.util.ArrayList;
    // import.util.Collections;
public class sorting_ArrayList {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(141231);
    list.add(3131);
    list.add(531);
    list.add(16);
    list.add(199);
    

    System.out.println(list);
    Collections.sort(list); //ascending
        System.out.println(list);


    //comparator => sorting logic funtion
    Collections.sort(list, Collections.reverseOrder()); //descending
        System.out.println(list);

    }
}
