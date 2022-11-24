import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
public static void rotate1(int []arr){
    int temp=arr[arr.length-1];
   for(int i=arr.length-1;i>=1;i--){
       arr[i]=arr[i-1];
       
   }
   arr[0]=temp;
}
  public static void rotate(int[] a, int k){
      k=k%a.length;
      if(k<0){
          k=k+a.length;
      }
    for(int i=0;i<k;i++){
        rotate1(a);
    }
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}