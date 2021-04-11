import java.util.*;
public class SelectionSort 
{
    void selection()
    {
      int ar[]=new int[5];
      System.out.println("enter the unsorted element array");
      Scanner sc=new Scanner(System.in);
      for(int k =0;k<5;k++)
      {
          ar[k]=sc.nextInt();
      }
      int n=ar.length;
      for(int i=0;i<n-1;i++)
      {
          for(int j=i+1;j<n;j++)
          {
              if(ar[i]>ar[j])
              {
                  int temp=ar[i];
                  ar[i]=ar[j];
                  ar[j]=temp;
              }
          }
      }
      
        for(int k =0;k<5;k++)
      {
          System.out.print(ar[k]+" ");
      }   
      
    }
    public static void main(String []args)
    {
        SelectionSort obj=new SelectionSort();
        obj.selection();
        
    }
    
}
