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
    barchart(arr);
 }
 public static void barchart(int[] arr){
     int max=arr[0];
     for(int i=1;i<arr.length;i++){
         if(arr[i]>max){
             max=arr[i];
         }
     }
     int r=max;
     for(int h=max;h>=1;h--){
         for(int i=0;i<arr.length;i++){
             if(arr[i]>=h){
                 System.out.print("*\t");
             }
             else{
                 System.out.print("\t");
             }
         }
         System.out.println();
      }
 }

}