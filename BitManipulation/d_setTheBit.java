package BitManipulation;

public class d_setTheBit {

    
    static void setBit(int a,int i){

        //left shift
        System.out.println(a | (1<<i));
    }
    public static void main(String[] args) {
        int a =13;
        int i=1;
        setBit(a,i);
    }
}
  

