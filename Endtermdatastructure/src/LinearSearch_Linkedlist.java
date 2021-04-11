
import java.util.Scanner;

  class Node
{
    int number;
    Node next;
}

public class LinearSearch_Linkedlist 
{
    Node START;
    LinearSearch_Linkedlist()
    {
        START=null;
    }
    void addnode(int data)
    {
        Node newnode =new Node();
        newnode.number=data;
        newnode.next=null;
        if(START==null)
        {
            START=newnode;
            
        }
        else
        {
            Node current=START;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newnode;
        }
    }
    void traverse()
    {
        if(START==null)
        {
            System.out.println("empty");
        }
        else
        {
            Node current;
            for(current=START;current!=null;current=current.next)
            {
                System.out.print(current.number+" ");
            }
        }
    }
    void linearsearch()
    {
        if(START==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            System.out.println("\nenter the searching element");
            Scanner sc2=new Scanner(System.in);
            int key=sc2.nextInt();
            Node current=START;
            int flag=0;
            while(current.next!=null)
            {
                if(current.number==key)
                {
                    flag=1;
                    break;
                }
                current=current.next;
            }
            if(flag==1)
            {
                System.out.println("number is found");
            }
            else
            {
                System.out.println("number is not found");
            }
        }
        
    }
    public static void main(String []args)
    {
         LinearSearch_Linkedlist obj=new  LinearSearch_Linkedlist();
         obj.addnode(1);
         obj.addnode(2);
         obj.addnode(3);
         obj.addnode(7);
         obj.addnode(4);
         obj.traverse();
         obj.linearsearch();
}
}
