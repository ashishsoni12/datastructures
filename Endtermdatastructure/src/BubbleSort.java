import java.util.*;

public class BubbleSort 
{
  void shorting()
  {
      int ar[]=new int[5];
      System.out.println("enter the unsorted element array");
      Scanner sc=new Scanner(System.in);
      for(int k =0;k<5;k++)
      {
          ar[k]=sc.nextInt();
      }
      
      int n=ar.length;
      int flag=0;
      for (int i=0;i<=n-1;i++)
      {   flag=0;
          for(int j=0;j<=n-1-i;j++)
          {   
              if(ar[j]>ar[j+1])
              {
                  int temp=ar[j];
                  ar[j]=ar[j+1];
                  ar[j+1]=temp;
                  flag=1;
              }
          }
      }
      if(flag==0)
      {
          System.out.println("Sorted array ");
           for(int k =0;k<5;k++){
          System.out.print(ar[k]+" ");
      }
          
      }
  }
  public static void main(String []args)
  {
      BubbleSort obj=new BubbleSort();
      obj.shorting();
  }
          
}
