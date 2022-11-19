import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int t=n;
      int count=0;
      while(t!=0){
          int lastdigit=t%10;
          count++;
          t=t/10;
      }
      
      int div=(int)Math.pow(10,count-1);
      while(div!=0){
          int q=n/div;
          System.out.println(q);
          n=n%div;
          div=div/10;
      }
     }
    }