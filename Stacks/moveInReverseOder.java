package Stacks;
import java.util.Stack;
import java.util.Scanner;
public class moveInReverseOder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);   
        System.out.println("st before copied:"+st);  
    //reverse the stack with for Loop
        Stack<Integer> st2 = new Stack<>();
        for(int i=0;i<5;i++){
            st2.push(st.pop());
        }
        System.out.println("st:"+st);
        System.out.println("st2:"+st2);
    //reverse the stack with  while Loop(better than for loop)
        Stack<Integer> st3 = new Stack<>();
        st3.push(6);
        st3.push(7);
        st3.push(8);
        st3.push(9);
        st3.push(10);   
        System.out.println("st3 before copied:"+st3);  
        Stack<Integer> st4 = new Stack<>();
        while(st3.size()>0){
            st4.push(st3.pop());
        }
        System.out.println("st3:"+st3);
        System.out.println("st4:"+st4);

    //Taking input from user 
    //     Stack<Integer> st_from_user = new Stack<>();
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("put no of element");
    //     int n = sc.nextInt();
    //     for(int i =0;i<n;i++){
    //         int x = sc.nextInt();
    //         st_from_user.push(x);
    //     }
    //     System.out.println("stack from user:" + st_from_user);
     }
}
