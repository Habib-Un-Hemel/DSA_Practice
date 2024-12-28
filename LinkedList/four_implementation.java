public class four_implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LinkedList {
        Node head = null; 
        Node tail  = null;
       
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head ==null){
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
        }
        void display(){ 
            Node temp = head;
            while (temp!=null) {
               System.out.print(temp.data+" "); 
               temp = temp.next;
            }
        }
        //head ,tail sobar kase ashe; 
        int size(){
            int counter =0;
            Node temp = head;
            while (temp!=null) {
               counter+=1;
               temp = temp.next;
            }  
            return counter;         
        }
        
    }
   public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.insertAtEnd(1);
    ll.insertAtEnd(5);
    ll.insertAtEnd(6);
    ll.display();
    System.out.println();
    System.out.print(ll.size());
   } 
}
