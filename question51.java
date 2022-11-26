import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int data=sc.nextInt();
    ceilAndFloor(arr,data);
 }
public static void ceilAndFloor(int[] arr,int data){
    int ceil=-1;
    int floor=-1;
    int lo=0;
    int hi=arr.length-1;
    while(lo<=hi){
        int mid=(lo+hi)/2;
        if(arr[mid]==data){
            System.out.print(data);
            return;
        }
        else if(arr[mid]<data){
            lo=mid+1;
            floor=arr[mid];
        }
        else{
            hi=mid-1;
            ceil=arr[mid];
        }
    }
    System.out.println(ceil);
    System.out.println(floor);
}
}