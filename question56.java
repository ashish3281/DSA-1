import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int r1=sc.nextInt();
    int c1=sc.nextInt();
    int[][]mat1=new int[r1][c1];
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            mat1[i][j]=sc.nextInt();
        }
    }
    ColumnTraversal(mat1);
 }
 public static void ColumnTraversal(int[][]A){
     int row=A.length;
     int col=A[0].length;
     for(int c=0;c<col;c++){
         if(c%2==0){
             for(int r=0;r<row;r++){
                 System.out.println(A[r][c]);
             }
         }
         else{
             for(int r=row-1;r>=0;r--){
                 System.out.println(A[r][c]);
             }
         }
     }
 }

}