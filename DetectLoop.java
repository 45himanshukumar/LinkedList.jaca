

public class DetectLoop {
      public static class Node{
        int data;
        Node next;
          Node(int data){
              this.data=data;
              this.next=null;
          }
        }
          public static  Node head;
          public static Node tail;
          public void Addlast(int data){
           Node newnode=new Node(data);
            if(head==null){
                 head=tail=newnode;
            }
            tail.next=newnode;
            tail=newnode;
          }
          public void Print(Node head){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
          //  System.out.println("null");
        }
        
        public static boolean  Detect(Node head){
            Node slow=head;
            Node fast=head;
            while(fast!=null &&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            
            if(fast==slow){
                return true; 
            }
        }
            return false;
        }
        public static void Remove(){
            Node slow=head;
            Node fast=head;
            boolean cycle=false;
            while(fast!=null && fast.next!=null){
                  slow= slow.next;
                  fast=  fast.next.next;
                  if(slow==fast){
                      cycle=true;
                      break;
                  }
            }
            if(cycle==false){
                return;
            }
              slow=head;
              Node prev=null;
              while(slow!=fast){
                  slow=slow.next;
                  prev=fast;
                  fast=fast.next;
              }
              prev.next=null;
            
             
        }
      
    public static void main(String[] args){
          DetectLoop ll=new DetectLoop();
             head= new Node(3);
             head.next= new Node(4);
             head.next.next=new Node(2);
             head.next.next.next=head.next;
           
          System.out.println(ll.Detect(head));
          ll.Remove();
          System.out.println(ll.Detect(head));
    }
    
}
