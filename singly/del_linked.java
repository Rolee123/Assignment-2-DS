import java.util.*;
class Node{
    int data;
    Node next;
}
class A{
    private Node head;
    A(){
       head=null;
    }
    void insert(int n)
    {
        Node temp=new Node();
         temp.data=n;
         temp.next=null;
   if(head==null)
        {
            head=temp;
        }
        else 
        {
           Node temp1=head;
           while(temp1.next!=null)
           {
               temp1=temp1.next;
           }
           temp1.next=temp;
           }
    }

void display()
{
    Node t=head;
    while(t!=null)
    {
    System.out.println(t.data);
    t=t.next;
    }
}
void del(int x)
{
    Node temp1;
    temp1=head;
    Node pre=temp1;
    if(head.data==x)
    {
        head=head.next;
    }
    while(temp1.data!=x)
    {
        pre=temp1;
        temp1=temp1.next;
    }
    if(temp1.data==x)
    {
        pre.next=temp1.next;
    }
    else{
        System.out.println("not found");
    }
}

}
class del_linked{
public static void main(String args[]){
    A obj=new A();
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        obj.insert(sc.nextInt());
      }
      int data=sc.nextInt();
    obj.del(data);
    obj.display();
}
}


