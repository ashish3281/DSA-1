import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int fv=0;
  int ans=0;
  while(n!=0){
      int lastdigit=n%10;
      fv++;
       ans=ans+fv*((int)Math.pow(10,lastdigit-1));
      n=n/10;
      
  }
  System.out.println(ans);
      
  
 }
}