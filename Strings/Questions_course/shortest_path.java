import java.util.*;
public class shortest_path {

    public static double check_shortest_path(String path){
        int x =0, y=0;
        for (int i = 0; i< path.length();i++){
            if(path.charAt(i)=='N'){
                y = y+1;
            }else if(path.charAt(i)=='S'){
                y = y-1;
            }else if(path.charAt(i)=='E'){
                x=x+1;
            }else if(path.charAt(i)=='W'){
                x=x-1;
            }
        }
         System.out.println(x +","+y);
        //if 
        double shortPath;
        shortPath = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return shortPath ;

    }
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(check_shortest_path(path));
    }
}
