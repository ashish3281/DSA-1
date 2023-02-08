import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int [][]mat=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=scn.nextInt();
            }
        }
        int s=scn.nextInt();
        int r=scn.nextInt();
        shellRotate(mat,s,r);
        display(mat);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void shellRotate(int[][]mat,int s,int r){
        int[] arr=fill1DArray(mat,s);
        rotate(arr,r);
        fill2DArray(mat,s,arr);
    }
    public static int[] fill1DArray(int[][]mat,int s){
        int row=mat.length;
        int col=mat[0].length;
        int rs=s-1;
        int cs=s-1;
        int re=row-s;
        int ce=col-s;
        int tes=2*(re-rs)+2*(ce-cs);
        int []arr=new int[tes];
        int idx=0;
        for(int i=rs;i<=re;i++){
            arr[idx]=mat[i][cs];
            idx++;
        }
        cs++;
        for(int j=cs;j<=ce;j++){
            arr[idx]=mat[re][j];
            idx++;
        }
        re--;
        for(int i=re;i>=rs;i--){
            arr[idx]=mat[i][ce];
            idx++;
        }
        ce--;
        for(int j=ce;j>=cs;j--){
            arr[idx]=mat[rs][j];
            idx++;
        }
        rs++;
        return arr;
    }
    public static void rotate(int[]arr,int k){
        int n=arr.length;
        k=k%n;
        if(k<0){
            k=k+n;
        }
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void reverse(int[]arr,int lo,int hi){
        while(lo<hi){
            int temp=arr[lo];
            arr[lo]=arr[hi];
            arr[hi]=temp;
            lo++;
            hi--;
        }
    }
     public static void fill2DArray(int[][]mat,int s,int[]arr){
        int row=mat.length;
        int col=mat[0].length;
        int rs=s-1;
        int cs=s-1;
        int re=row-s;
        int ce=col-s;
        int tes=2*(re-rs)+2*(ce-cs);
        //int []arr=new int[tes];
        int idx=0;
        for(int i=rs;i<=re;i++){
            mat[i][cs]=arr[idx];
            idx++;
        }
        cs++;
        for(int j=cs;j<=ce;j++){
            mat[re][j]=arr[idx];
            idx++;
        }
        re--;
        for(int i=re;i>=rs;i--){
            mat[i][ce]=arr[idx];
            idx++;
        }
        ce--;
        for(int j=ce;j>=cs;j--){
            mat[rs][j]=arr[idx];
            idx++;
        }
        rs++;
        
    }
    
}