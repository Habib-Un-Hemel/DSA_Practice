package Stacks;

import java.util.Stack;

public class moveInReverseOder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(5);
        st.push(6);
        st.push(2);   
        System.out.println(st);  
        Stack<Integer> st2 = new Stack<>();
        for(int i=0;i<5;i++){
            st2.push(st.pop());
        }
        System.out.println(st);
        System.out.println(st2);

        
    }
}
