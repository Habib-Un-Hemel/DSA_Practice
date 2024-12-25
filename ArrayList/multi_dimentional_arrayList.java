package ArrayList;


import java.util.*;
public class multi_dimentional_arrayList {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> main_list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        main_list.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(22);
        main_list.add(list2);

        //System.out.println(main_list);
        

        //nested Loop
        for (int i=0; i<main_list.size();i++){ 
            ArrayList<Integer> currList = main_list.get(i);           
            for(int j=0; j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        }
}
