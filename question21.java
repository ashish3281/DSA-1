import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
        int ans= 0;
        int x=1;
        while(n!=0){
        int rem = n%b;
        ans=ans+rem*x;
        x*=10;
        n/=b;
        }
        return ans;
   }
   
  }