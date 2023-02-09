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
           int sp =saddlePoint(mat1);
           if(sp==-1){
               System.out.println("Invalid input");
           }
           else{
               System.out.println(sp);
           }
    }
    public static int saddlePoint(int[][]mat){
        int n=mat.length;
        for(int r=0;r<n;r++){
            int minc=0;
            int minv=mat[r][0];
            for(int c=1;c<n;c++){
                if(mat[r][c]<minv){
                    minv=mat[r][c];
                    minc=c;
                }
            }
            boolean isSP=true;
            for(int i=0;i<n;i++){
                if(mat[i][minc]>minv){
                    isSP=false;
                    break;
                }
            }
            if(isSP==true){
                return minv;
            }
        }
        return -1;
    }


}