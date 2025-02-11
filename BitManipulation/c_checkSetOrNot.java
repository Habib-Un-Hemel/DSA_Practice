/*
 * Question:Check if the i th bit is set or not
 */

 //using left shift the 1
package BitManipulation;
public class c_checkSetOrNot {
    
    static void checkingSetLEFTSHIFT(int a,int i){

        if((a & (1<<i))!=0){
            System.out.println("set");
        }else{
            System.out.println("not set");
        }
    }
        static void checkingSetRIGHTSHIFT(int a,int i){

        if((1 & (a>>i))!=0){
            System.out.println("Rset");
        }else{
            System.out.println("Rnot set");
        }
    }



    public static void main(String[] args) {
        int a =13;
        int i=3;
        checkingSetLEFTSHIFT(a,i);
        checkingSetRIGHTSHIFT(a,i);

    }
}
