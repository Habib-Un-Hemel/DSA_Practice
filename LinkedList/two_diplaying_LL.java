public class two_diplaying_LL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }

    }

    public static void main(String args[]){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(6);
        Node e = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e; 
//method-1 so much dump
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);

//method 2 -> for loop
        Node temp = a;
        for(int i=1 ; i<=5;i++){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    
    //method3 -> while loop
        Node temp2 = a;
        while (temp2!=null) {
            System.out.println(temp2.data+ " ");
            temp2 = temp2.next;           
        }
    }
}
