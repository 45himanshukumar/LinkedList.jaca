

public class linked {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void displayr(Node head){
            if(head==null){
                return;
            }
            System.out.println(head.data);
               displayr(head.next);
    }
    public static void displayre(Node head){
        if(head==null){
            return;
        }
        displayre(head.next);
        System.out.print(head.data+" ");
          
}
  public static int Length(Node head){
      int count=0;
   while(head!=null){
        count++;
        head=head.next;
   }
    return count;
  }


    public static void main(String[] args){
       Node a= new Node(5);
       Node b= new Node(12);
       Node c= new Node(6);
       Node d= new Node(9);
       Node e= new Node(11);

       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;
      System.out.println(a.next.data);
       displayr(a);
       System.out.println();
       displayre(a);
      int len= Length(a);
      System.out.println();
      System.out.println(len);
       Node temp=a;
      // for(int i=0; i<5; i++){
             //System.out.println(temp.data+" ");
             //temp=temp.next;
      // }
       //while(temp!=null){
        //System.out.println(temp.data);
          //temp=temp.next;
      // }
       //while(a!=null){
       //  System.out.println(a.data);
        ///    a=a.next;
      // }
       //recurrsevely 

}
    
}
