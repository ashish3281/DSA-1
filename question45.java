import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int[] a1=new int[n1];
    for(int i=0;i<n1;i++){
        a1[i]=sc.nextInt();
    }
     int n2=sc.nextInt();
    int[] a2=new int[n2];
    for(int i=0;i<n2;i++){
        a2[i]=sc.nextInt();
    }
    int [] sum=sumOfTwoArray(a1,a2);
    for(int i=0;i<sum.length;i++){
        if(i==0&&sum[i]==1){
            System.out.println(sum[i]);
        }
        else if(i>0){
            System.out.println(sum[i]);
        }
    }
 }
 public static int[] sumOfTwoArray(int[] a1,int[] a2){
     int len=a1.length>a2.length?a1.length+1:a2.length+1;
     int [] res= new int[len];
     int carry=0;
     int i=a1.length-1;
     int j=a2.length-1;
     int k=res.length-1;
     while(k!=0){
         int sum=carry;
         if(i>=0){
             sum=sum+a1[i];
         }
         if(j>=0){
             sum=sum+a2[j];
         }
         int val=sum%10;
         carry=sum/10;
         res[k]=val;
         i--;
         j--;
         k--;
     }
     return res;
 }

}