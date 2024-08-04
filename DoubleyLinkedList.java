public class DoubleyLinkedList {
      public class Node{
        int data;
        Node next;
        Node prev;
          Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
          }
      }
      public static Node head;
      public static Node tail;
      public void Addfirst(int data){
        Node newnode= new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
      }
      public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
      }

      
    public static void main(String[] args){
        DoubleyLinkedList dll= new DoubleyLinkedList();
        dll.Addfirst(4);
        dll.Addfirst(5);
        dll.Addfirst(6);
        dll.Addfirst(3);
         dll.print();
    }
    
}
