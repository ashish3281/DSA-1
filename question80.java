import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int a=lastIndex(arr,0,x);
        System.out.println(a);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        int lis=lastIndex(arr,idx+1,x);
        if(lis!=-1){
            return lis;
        }
        else if(arr[idx]==x){
            return idx;
        }
        else{
            return -1;
        }
        
    }

}