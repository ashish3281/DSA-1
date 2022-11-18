import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     AnyBasetoAnyBase(n,sourceBase,destBase);
   }  
   
   public static void AnyBasetoAnyBase(int n,int b1,int b2){
       int decimal=AnybaseToDecimal(n,b1);
       int result=decimalToAnybase(decimal,b2);
       System.out.println(result);
   }
   
   public static int AnybaseToDecimal(int n,int b){
       int ans=0;
       int x=1;
       while(n!=0){
           int lastdigit=n%10;
           ans+=lastdigit*x;
           x=x*b;
           n=n/10;
       }
       return ans;
   }
   
   public static int decimalToAnybase(int n,int b){
       int ans=0;
       int x=1;
       while(n!=0){
           int rem=n%b;
           ans=ans+rem*x;
           x=x*10;
           n=n/b;
       }
       return ans;
   }
  }