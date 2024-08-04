public class Reverse {
     public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public static Node head;
        public static  Node tail;
        
        public Node reversr(Node node){
            Node curr=node;
            Node prev=null;
            while(curr!=null){
                Node temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            node=prev;
            return node;
        }
        void printList(Node node) {
            while (node != null) {
                System.out.print(node.data + "-> ");
                
                node = node.next;
            }
            System.out.println("null");
        }
    
     
    public static void main(String[] args){
       
       Reverse ll=new Reverse();
       ll.head=new Node(1);
       ll.head.next=new Node(2);
       ll.head.next.next=new Node(3);
       ll.head.next.next.next=new Node(4);
        
         ll.printList(head);
         // head=ll.reversr(head);
          System.out.println();
          ll.printList(head);

  //    

     
    }
    
} 
