public class List {
    private int size;
    private Node head;
    public List(){
        size=0;
        head=null;
    }
public void addNode(Node node){
    Node temp=head;
    while (temp.next!=null){
        temp=temp.next;
    }
  temp=node;
    size++;
}
    public void print(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data+",");
            temp = temp.next;
        }
        System.out.println();
    }
}
class Node{
public     int data;
 //public  Node pre;
  public  Node next;
    public Node(int data){
        this.data=data;
    }
}
