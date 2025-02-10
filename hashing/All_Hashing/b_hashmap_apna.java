import java.util.*;
public class b_hashmap_apna {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //1. Initialize
        HashMap<String, Integer> map = new HashMap<>();

        //2. add - (put)
        map.put("USA", 1);
        map.put("BD", 130);
        map.put("INDIA", 70);
        map.put("Arab", 40);

        //2.1 UPDATE using put
        map.put("Arab", 38);    
        System.out.println(map);

        //3.  containsKey
        System.out.println(map.containsKey("USA"));

        //4. get
        System.out.println(map.get("INDIA"));
        System.out.println(map.get("Lallalala"));

        //5. Interation syntax
            //previous
            int arr[] = {1,2,3,4};
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            
            //new syntax
            System.out.println();
            // for (---- value: collections)
            for(int value:arr){
                System.out.print(value+" ");
            }

            // map iteration (entrySet)
            for(Map.Entry<String,Integer> e : map.entrySet()){
                System.out.println(e.getKey());
                System.out.println(e.getValue());
            }
            //keySet
            Set<String> keys = map.keySet();
            for(String key: keys){
                System.out.println(key+" " +map.get(key));
            }

            //5. remove

            map.remove("USA");
            System.out.println(map);
    }
    
} 
