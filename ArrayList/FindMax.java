package ArrayList;

import java.util.ArrayList;

public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

         
        //my code initially =>int max = -100000;

        int max = Integer.MIN_VALUE;
        for (int i=0; i<list.size();i++){
            if (list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.println(max);
    }
}
