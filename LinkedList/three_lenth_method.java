public class three_lenth_method {

    public static int check_len(Node head){
        int counter = 0;
        while(head!=null){
            counter +=1;
            head = head.next;
        }
        return counter;
    }

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
        System.out.println(check_len(a));
        
    }
}


