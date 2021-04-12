import java.util.*;
public class InsertionSort 

{
    void insertion()
    {
      int ar[]=new int[5];
      System.out.println("enter the unsorted element array");
      Scanner sc=new Scanner(System.in);
      for(int k=0;k<5;k++)
      {
          ar[k]=sc.nextInt();
      }
      //alogo
      for(int i=1;i<ar.length;i++)   //pass
      {
          for(int j=0;j<i;j++)   //comp
          {
              if(ar[j]>ar[i])
              {
                  int temp=ar[j];
                  ar[j]=ar[i];
                  ar[i]=temp;
                  
              }
          }
      }
      //output
      System.out.println("Sorted array ");
           for(int k=0;k<5;k++)
           {
            System.out.print(ar[k]+" ");
           } 
    }
    public static void main(String[] args)
    {
        InsertionSort obj =new InsertionSort();
        obj.insertion();
    }
    
}
