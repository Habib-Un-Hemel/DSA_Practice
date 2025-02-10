import java.util.HashSet;
import java.util.Iterator;

public class a_hashset_apna {
    public static void main(String[] args) {

    //1. Initiate 
    HashSet<Integer> set = new HashSet<>();
    //example:creating relatetion ArrayList<Integer> list = new ArrayList<>();
    
    //2. insert (Add)
    set.add(1);
    set.add(2);
    set.add(4);
    set.add(1);
    System.out.println(set);

  //3. Search - contains

   if(set.contains(2)){
     System.out.println("2 is inside");
   }
    if(!set.contains(3)){
      System.out.println("3 nai");
    }

  //4.delete -> remove
    set.remove(2);
    System.out.println(set);

  //5.size
    System.out.println("Size of the HashSet is: "+set.size());


  //6.iterator
  Iterator it = set.iterator();
  //hasNext ; next
  while(it.hasNext()){
      System.out.println(it.next());
    }
    
  }
}



