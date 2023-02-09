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
           int target=scn.nextInt();
           search(mat1,target);
    }
    public static void search(int[][]mat,int target){
        int r=0;
        int c=mat[0].length-1;
        while(r<mat.length &&c>=0){
            if(mat[r][c]==target){
                System.out.println(r+"\n"+c);
                return;
            }
            else if(mat[r][c]<target){
                r++;
            }
            else{
            c--;
            }
        }
        System.out.println("Not Found");
    }

}