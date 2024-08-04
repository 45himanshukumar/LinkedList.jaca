

public class MergeSort1 {
     public static class Node{
        int data;
          Node next;
          Node(int data){
             this.data=data;
             this.next=null;
          }
     }
     public static Node head;
       public Node findnode(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
       public Node merge(Node head1,Node head2){
            Node mergell=new Node(-1);
              Node temp=mergell;
              while(head1!=null &&head2!=null){
                if(head1.data<=head2.data){
                       temp.next=head1;
                       head1=head1.next;
                       temp=temp.next;
                     }
                     else{
                        temp.next=head2;
                        head2=head2.next;
                        temp=temp.next;
                     }  
              }
              while(head1!=null){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
              }
              while(head2!=null){
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
              }
              return mergell.next;
       }
       public Node mergesort(Node head){
           if(head!=null||head.next==null){
                return head;
              }
        Node mid=findnode(head);
        Node righthaed=mid.next;
         mid.next=null;
        Node lefthead=mergesort(head);
        Node righthead=mergesort(righthaed); 
        return merge(lefthead,righthead);
            }

            public  void Print(){
                if(head==null){
                    System.out.println("linkedlist is empty");
                }
                Node temp=head;
               while(temp!=null){
                  System.out.print(temp.data+"->");
                   temp=temp.next;
               }
               System.out.println("null");
            }
       
    public static void main(String [] args){
        MergeSort1 ll=new MergeSort1();
         head=new Node(9);
         head.next=new Node(8);
         head.next.next=new Node(5);
         head.next.next.next=new Node(7);
            ll.Print();
         ll.head= ll.mergesort(head);

         ll.Print();
    }
    
}
