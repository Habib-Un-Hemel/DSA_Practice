import java.util.*;
public class string_compression_optimize {
    public static StringBuilder compresss(String str){
        StringBuilder newStr = new StringBuilder("");
       
        for( int i =0;i<str.length();i++){
            
            
            Integer count = 1;
            // this loops condition is time taking  to think i< str.length()-1
            while (i< str.length()-1 && str.charAt(i) == str.charAt(i+1) ){


                count++;
                i++;
            }
            newStr.append(str.charAt(i)) ;
            if( count>1){
                newStr.append(count.toString()) ;
            }
            

        }return newStr;
    }
    public static void main(String args[]){
        String str = "aaabbccddd";
        System.out.println(compresss(str));
    }
}

// O(n) because its not  nested loop || see carefull i++ is increasing in a same manner with the help of two loops
