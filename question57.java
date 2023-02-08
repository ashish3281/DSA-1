import java.io.*;
import java.util.*;

public class Main {

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
    spiralDisplay(mat1);
    }
public static void spiralDisplay(int[][]A){
    int rs=0;
    int cs=0;
    int re=A.length-1;
    int ce=A[0].length-1;
    int count=0;
    int te=A.length*A[0].length;

    while(count<te){
        for(int i=rs;i<=re&&count<te;i++){
            System.out.println(A[i][cs]);
            count++;
        }
        cs++;
        for(int j=cs;j<=ce&&count<te;j++){
            System.out.println(A[re][j]);
            count++;
        }
        re--;
        for(int i=re;i>=rs&&count<te;i--){
            System.out.println(A[i][ce]);
            count++;
        }
        ce--;
        for(int j=ce;j>=cs&&count<te;j--){
            System.out.println(A[rs][j]);
            count++;
        }
        rs++;
    }
}

}