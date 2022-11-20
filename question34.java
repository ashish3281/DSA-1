import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int k=sc.nextInt();
     int temp=n;
     int count=0;
     while(temp!=0){
         int lastdigit=n%10;
         count++;
         temp=temp/10;
     }
     k=k%count;
     if(k<0){
         k=k+count;
     }
     int b=n%((int)Math.pow(10,k));
     int a=n/((int)Math.pow(10,k));
     int ans=b*((int)Math.pow(10,count-k))+a;
     System.out.println(ans);
     
    }
   }