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
    int data=sc.nextInt();
    int fi=firstindex(arr,data);
    int li=Lastindex(arr,data);
    System.out.println(fi);
    System.out.println(li);
 }
 public static int firstindex(int []arr,int data){
     int lo=0;
     int fi=-1;
     int hi=arr.length-1;
     while(lo<=hi){
         int mid=(lo+hi)/2;
         if(arr[mid]==data){
             fi=mid;
             hi=mid-1;
         }
         else if(arr[mid]<data){
             lo=mid+1;
         }
         else{
             hi=mid-1;
         }
     }
     return fi;
 }
 public static int Lastindex(int []arr,int data){
     int lo=0;
     int ei=-1;
     int hi=arr.length-1;
     while(lo<=hi){
         int mid=(lo+hi)/2;
         if(arr[mid]==data){
             ei=mid;
            lo=mid+1;
         }
         else if(arr[mid]<data){
             lo=mid+1;
         }
         else{
             hi=mid-1;
         }
     }
     return ei;
 }
}