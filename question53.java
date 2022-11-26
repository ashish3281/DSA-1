import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int [] arr=new int[n];
 for(int i=0;i<n;i++){
     arr[i]=sc.nextInt();
     
 }
 printSubset(arr);
 }
public static void printSubset(int[] arr){
    int ts=(int)Math.pow(2,arr.length);
  int n= arr.length;
    for(int d=0;d<ts;d++){
        int []bin=decToBinary(d,n);
        for(int i=0;i<n;i++){
            if(bin[i]==0){
                System.out.print("-\t");
            }
            else{
                System.out.print(arr[i]+"\t");
            }
        }
        System.out.println();
    }
}
public static int[] decToBinary(int dec,int len){
    int[] ans=new int[len];
    int idx=ans.length-1;
    while(dec>0){
        int rem=dec%2;
        dec=dec/2;
        ans[idx]=rem;
        idx--;
    }
    return ans;
}
}