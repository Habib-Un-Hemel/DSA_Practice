import java.util.*;

public class StringBuilder_DS {
    public static void main(String args[]) {
        StringBuilder x = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            x.append(ch);
        }
        System.out.println(x);
        // O(26)
        //if I use String Data Structure here it will cost me O(N^2) because it will first copy (n iteration ) then change (n iteration)
    }
}
