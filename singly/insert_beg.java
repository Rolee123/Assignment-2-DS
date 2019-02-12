import java.util.*;
class Node{
    int data;
    Node next;
}
class b
{
    private Node head;
    b()
    {
        head=null;
    }
    void insert(int n)
    {
        Node temp= new Node();
        temp.data=n;
        temp.next=head;
        head=temp;
    }
   public void display()
    {
    Node temp1;
    temp1=head;
    while(temp1!=null)
    {
        System.out.println(temp1.data);
        temp1=temp1.next;
    }
    }
}
class insert_beg{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        b obj= new b();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            obj.insert(x);
        }
        obj.display();
    }
}