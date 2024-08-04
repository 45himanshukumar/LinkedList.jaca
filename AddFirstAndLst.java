
public class AddFirstAndLst {
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
        public static int size;
        public void AddFirst(int data){
            Node newNode=new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
              newNode.next=head;
              head=newNode;
            
        }
        public void AddLAst(int data){
            Node newNode=new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;

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
        public void AddMiddle(int inx,int data){
            Node NewNode=new Node(data);
            size++;
             Node temp=head;
             int i=0;
             while(i<inx-1){
                 temp=temp.next;
                 i++;
             }
             NewNode.next=temp.next;
             temp.next=NewNode;
        }
        public static int Printlength(Node a){
            int count=0;
            while(a!=null){
                count++;
                a=a.next;
            }
            return count;
        }
      public int RemoveFirst(){
        Node temp=head;
        if(size==0){
            System.out.println("linkedList is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=temp.data;
        temp=temp.next;
         head=temp;
         size--;
         return val;
          
      }
      public int ReoveLast(){
           if(size==0){
            System.out.println("linkedList is empty");
                return Integer.MIN_VALUE;
           }
           if(size==1){
               int val=head.data;
               head=tail=null;
               size=0;
               return val;
           }
             Node temp=head;
             for(int i=0; i<size-2; i++){
                  temp=temp.next;
             }
             int val=temp.next.data;
             temp.next=null;
             tail=temp;
             size--;
             return val;
      }
      public int Search(int key){
        Node temp=head;
       
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
      }
      public int searchRecur(int key) {
             return helper( head, key);
      }
      public int helper(Node head,int key){
           if(head==null){
            return -1;
           }
          if(head.data==key){
            return 0;
          }
         int ind= helper(head.next, key);
         if(ind==0){
            return ind+1;
         }
         return -1;
        }
        public void DeleteFromNthnode(int n){
            int size=0;
            Node temp=head;
            while(temp!=null){
                size++;
                temp=temp.next;
            }
            if(n==size){
                head=head.next;
                return;
            }
            int i=1;
            int iend=size-n;
            Node prev=head;
            while(i<iend){
                prev=prev.next;
                i++;
            }
            prev.next=prev.next.next;
              return;
        }
        public Node reversr(Node head){
            Node curr=head;
            Node prev=null;
            while(curr!=null){
                Node temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            head=prev;
            return head;
        }
        public Node Findmid(Node head){
              Node slow=head;
              Node fast= head;
              while(fast!=null &&fast.next==null){
                  slow=slow.next;  //+1
                  fast=fast.next.next;   //+2;
              }
              return slow;
        }
        public boolean checkPailndrome(){
            //find the mid
            Node mid=Findmid(head);
              //reverse half
              Node curr=mid;
              Node prev=null;
              Node next;
              while(curr!=null){
                next=curr.next;
                curr.next=null;
                curr=next;
                prev=curr;
              }
              //check left and right half
              Node right=mid;
              Node left=head;
              while(right!=null){
                if(left.data!=right.data){
                     return  false;
                }
                left=left.next;
                right=right.next;
              }
              return true;
        }
        public boolean  Detect(Node head){
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

    public static void main(String[] args){
        AddFirstAndLst ll=new AddFirstAndLst();
        head =new Node(3);
           ll.AddFirst(2);
           ll.AddFirst(1);
          // ll.AddLAst(2);
          // ll.AddLAst(1);
           //ll.AddMiddle(2, 5);
            ll. Print();
         System.out.println(  ll. checkPailndrome());

          // System.out.println(  ll.reversr(head));
             

           //int key= ll.Search(5);
           // System.out.println(key);

         //ll.searchRecur(3);
        //ll.DeleteFromNthnode(3);
          //  ll.  Print();
        // ll.RemoveFirst();
        // ll.Print();
          // System.out.println(ll.size);
          /// ll.ReoveLast();
          // ll. Print();
         ////int len=  ll.Printlength(head);
         //System.out.println(len);
       // System.out.println(ll.size);
      //int key= ll.Search(3);
       // System.out.println(key);
           //print the linkedlist
           
    }
    
}
