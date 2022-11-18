import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      int ans=0;
      int x=1;
      while(n!=0){
          int lastdigit=n%10;
          ans=ans+lastdigit*x;
          x=x*b;
          n=n/10;
      }
      return ans;
   }
  }