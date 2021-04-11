
import java.util.Scanner;


public class LinearSearch 
{ 
    void linear()
    {
      System.out.println("enter the  array");
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
      for(int i=0;i<5;i++)
      {
          a[i]=sc.nextInt();
      }
      System.out.println("enter the searching element");
      int key=sc.nextInt();
      int flag=0;
      int index=0; 
      
      // logic for linear search
      for(int i=0;i<a.length;i++)
      {
          if(key==a[i])
          {
              flag=1;              //this flag used for determning no is found or not
              index=i;              //for printing index no when no is found1
              break; 
              
          }
      }
      if(flag==1)
      {
          System.out.println("No is found at index no "+ index);
      }
      else
      {
          System.out.println("no. is not found");
      }
    }
    public static void main(String []args)
    {
        LinearSearch obj=new LinearSearch();
        obj.linear();
    }
}
