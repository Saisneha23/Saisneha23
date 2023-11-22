import java.util.*;
class maxmin{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
      int [] arr=new int[5];
        int n=Integer.MAX_VALUE;
        int m=Integer.MIN_VALUE;
        
      for(int i=0;i<5;i++)
      {
         arr[i]=sc.nextInt();
       }
       //System.out.println(n);
        //System.out.println(m);
        for(int i=0;i<5;i++)
        {
          m=Math.max(arr[i],m);
          n=Math.min(arr[i],n);
          }
        System.out.println("the max is "+ m);
        System.out.println("the min is "+n);
       }
     }
      
      
