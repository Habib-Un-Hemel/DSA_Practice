public class two_diplaying_LL_part2 {
    //method1 display LinkedList recursively
    public static void display_recursively(Node head){
            if(head ==null){
                return;
            }
            System.out.print(head.data+" ");
            display_recursively(head.next);
        }
    //method2 display reversely LinkedList recursively
    public static void display_reverse_recursively(Node head){
            if(head ==null){
                return;
            }
            display_reverse_recursively(head.next);

            System.out.print(head.data+" ");
        }
    
    //method3 function create kore
    public static void display(Node head){
        Node temp = head;
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
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
        display(a);
        System.out.println( );
        display_recursively(a);
        System.out.println( );
        display_reverse_recursively(a);
    }
}

