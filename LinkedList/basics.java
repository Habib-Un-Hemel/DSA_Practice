public class basics {
    public static class Node{
        int data;
        Node next; // Node ta samner node er full address store krtese || c++ e pointer thake oitai buja logical laghe
        Node(int data){
            this.data =data;
        }
    }
    public static void main(String args[]){
        Node a = new Node(5); 
        Node b = new Node(3); 
        Node c = new Node(9); 
        Node d = new Node(8); 
        Node e = new Node(5); 
        System.out.println(a.data);
    }
}
