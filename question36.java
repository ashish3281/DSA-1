import java.util.*;

public class Main{

public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int div=2;
 while(div*div<=n){
     if(n % div==0){
         System.out.print(div+" ");
         n=n/div;
     }
     else{
         div++;
     }
 }
  if (n != 1)
    {
      System.out.print(n);
    }
 }
}