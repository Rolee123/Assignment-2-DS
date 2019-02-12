import java.util.Scanner;
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

}
class Insert_end{
public static void main(String args[]){
    A obj=new A();
    Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            obj.insert(x);
        }
    obj.display();
}
}


