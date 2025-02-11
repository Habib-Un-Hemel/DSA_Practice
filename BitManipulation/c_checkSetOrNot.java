/*
 * Question:Check if the i th bit is set or not
 */

package BitManipulation;
public class c_checkSetOrNot {
    
    static void checkingSet(int a,int i){

        if((a & (1<<i))!=0){
            System.out.println("set");
        }else{
            System.out.println("not set");
        }
    }
    public static void main(String[] args) {
        int a =13;
        int i=3;
        checkingSet(a,i);

    }
}
