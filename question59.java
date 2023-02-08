import java.io.*;
import java.util.*;

public class Main {
 public static void main(String[] args) throws Exception {

             Scanner scn=new Scanner(System.in);
            int n=scn.nextInt();
            int[][] mat1=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    mat1[i][j]=scn.nextInt();
                }
            }
            rotateBy90(mat1);
            display(mat1);
        
    }


    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void transpose(int[][]mat){
        for(int i=0;i<mat.length;i++){
            for(int j=i;j<mat.length;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
    public static void ColumnReversal(int[][] mat){
        int n=mat.length;
        int lo=0;
        int hi=n-1;
        while(lo<hi){
            for(int i=0;i<n;i++){
                int temp=mat[i][lo];
                mat[i][lo]=mat[i][hi];
                mat[i][hi]=temp;
             
            }
               lo++;
                hi--;
        }
    }
    public static void rotateBy90(int [][]mat){
        transpose(mat);
        ColumnReversal(mat);
    }
      
}