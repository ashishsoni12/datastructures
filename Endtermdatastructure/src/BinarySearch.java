import java.util.*;
public class BinarySearch 
{
  public void search()
  {   System.out.println("enter the sorted array");
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
      for(int i=0;i<5;i++)
      {
          a[i]=sc.nextInt();
      }
      System.out.println("enter the searching element");
      int key=sc.nextInt();
      int start=0;
      int end=a.length-1;
      int count=0;
      int mid=0;
      while(start<=end)
      {   
           mid=(start+end)/2;
          if(key==a[mid])
          {
              count++;
              break;
          }
          else if(key>a[mid])
          {
              start=mid+1;
          }
          else
          {
              end=mid-1;
          }

          
      }
      if(count==1)
      {
          System.out.println("no. is found  at index no  "+ mid);
          
      }
      else
      {
          System.out.println("no. is not found");
      }
      
      
  }
  public static void main(String []args)
  {
      BinarySearch obj=new BinarySearch();
      obj.search();
      
  }
    
}

