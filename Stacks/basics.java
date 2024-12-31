package Stacks;
import java.util.Stack;
 
public class basics {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(11);
    st.push(21);
    st.push(41);
    st.push(3);
    st.push(9);
    System.out.println(st.peek());
    System.out.println(st);
    System.out.println(st.pop());
    System.out.println(st);
    System.out.println(st.size());
    System.out.println(st.isEmpty());

    //print the first element
    while( st.size()>1){
        st.pop();
    }System.out.println(st.peek());

  }  
}
