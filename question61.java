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
            printDiagonally(mat1);
    }
    public static void printDiagonally(int[][]a){
        int n=a.length;
        for(int d=0;d<n;d++){
            for(int r=0,c=d;c<n;r++,c++){
                System.out.println(a[r][c]);
            }
        }
    }

}