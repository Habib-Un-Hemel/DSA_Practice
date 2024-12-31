package Stacks;
import java.util.Stack;
public class PrintManuallyWithArray {
    public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5); 
    
    int n = st.size();
    int[] arr = new int[n];
    int idx = arr.length-1;
     System.out.println(st);
    
    for(int i =idx ; i>=0;i--){
        arr[i] = st.pop();
    }
    System.out.println(st);
    for(int i =0 ; i<idx;i++){
        System.out.print(arr[i]+" ");
        st.push(arr[i]);
    }
    System.out.println();
    System.out.println(st);
    

}  
}
