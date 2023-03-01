import java.io.*;
import java.util.*;

public class Main {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    int len=a.length+b.length;
    int[] merged=new int[len];
    int i=0;
    int j=0;
    int k=0;
    while(i<a.length && j<b.length){
        if(a[i]<b[j]){
            merged[k]=a[i];
            i++;
            k++;
        }
        else{
            merged[k]=b[j];
            j++;
            k++;
        }
    }
    while(i<a.length){
        merged[k]=a[i];
        i++;
        k++;
    }
    while(j<b.length){
        merged[k]=b[j];
        j++;
        k++;
    }
    
    return merged;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}