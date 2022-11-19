import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int t1=0;
      int t2=1;
      int temp;
      for(int i=0;i<n;i++){
          System.out.println(t1);
          temp=t1+t2;
          t1=t2;
          t2=temp;
          
          
      }
   }
  }