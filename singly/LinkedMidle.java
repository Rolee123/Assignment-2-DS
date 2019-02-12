import java.util.*;
class Node{
     int data;
      Node next;
        Node(int n){
               data=n;
                  }
}
class a{
  private Node head = null;
  private Node temp =null;
  private Node temp1 =null;
  public void insert(int data){
    Node temp = new Node(data);
    temp.next = null;
    if(head == null) {
      head=temp;
      temp1 = head;
      }
    else{
     temp1.next=temp;
     temp1 = temp1.next;
    }

  }
        void insert_mi(int n,int pos){
           Node temp1=new Node(n);
           Node temp=head;
           if(temp==null){
             return;
           }
           
           if(pos==0){
             temp1.next=temp;
            head=temp1;
            }
           else{
                  for(int i=0;i<pos-1;i++)
                  {
                  temp=temp.next;
                  }
                  temp1.next=temp.next;
                  temp.next=temp1;
                
           }
        }

            public void display1(){
                temp1 = head;
                while(temp1!=null){
	                  System.out.println(temp1.data);
	                  temp1 = temp1.next;
                }
            }
    }
public class LinkedMidle{
       public static void main(String args[]){
          a obj=new a();
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          for(int i=0;i<n;i++)
          {
            obj.insert(sc.nextInt());
          }
          int data=sc.nextInt();
          int pos=sc.nextInt();
          if(pos<0 || pos>n)
          {
            System.out.println("error");
          }
          else
            {
              obj.insert_mi(data,pos);
              obj.display1();
            }
        }
}

