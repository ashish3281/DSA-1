import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
     int n1=sc.nextInt();
     int n2=sc.nextInt();
     int dividend=n1;
     int divisor=n2;
     while(dividend%divisor!=0){
         int remainder=dividend%divisor;
         dividend=divisor;
         divisor=remainder;
     }
     int GCD=divisor;
     System.out.println(GCD);
     int LCM=(n1*n2)/GCD;
     System.out.println(LCM);
     }
    }