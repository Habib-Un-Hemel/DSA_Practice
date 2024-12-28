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
        void insertAtBeginning(int data){
            Node temp = new Node(data);
            if(head ==null){
                head = temp;
                tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
        }
        void insertAt(int idx, int data){
            Node t = new Node(data);
            Node temp = head;
            if (idx ==size()){
                insertAtEnd(data);
                return;
            }
            else if (idx ==0){
                insertAtBeginning(data);
                return;
            }
            else if(idx<0){
                System.out.println("wrong index");
            }
            else if(idx>size()){
                System.out.println("wrong index");
            }
            for(int i=1;i<= idx-1;i++){
                temp =temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        int getAt(int idx){
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp = temp.next;
            }
            return temp.data;
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
    System.out.println(ll.size());
    ll.insertAtBeginning(10);
    ll.display();
    ll.insertAt(1,100);
        System.out.println();
    ll.display();
     System.out.println();
    
    System.out.println(ll.getAt(4));

   } 
}
