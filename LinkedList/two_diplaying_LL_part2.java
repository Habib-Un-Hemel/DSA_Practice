public class two_diplaying_LL_part2 {

    //function create kore



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


    }
}

