package Stacks;

import java.util.Stack;

public class InsertAtAnyIndex {
    public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);  
    //intert at bottom or index = 0 
    Stack<Integer> st2 = new Stack<>();
        while(st.size()>0){
            st2.push(st.pop());
        }
        st.push(100);
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println(st);
    
    //intert at   index = 2 
    Stack<Integer> st3 = new Stack<>();
        while(st.size()>2){
            st3.push(st.pop());
        }
        st.push(3321);
        while(st3.size()>0){
            st.push(st3.pop());
        }
        System.out.println(st);
    }

}