public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data ;
            this.next  = null;
        }
    }
    //head and tail one times so class er modhe define kore dei
    //head type o Node
    public static Node head;
    public static Node tail;
    //method
    //add()
    //remove()
    //print()
    //search()
    public static void main(String args[]){
        LinkedList ll = new LinkedList(); //linkedList obj create
        ll.head = new Node(1);
        ll.head.next = new Node(2);
    }
}
