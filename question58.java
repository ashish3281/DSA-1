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
    ExitPoint(mat1);
    }
public static void ExitPoint(int[][]mat){
    int row=mat.length;
    int col=mat[0].length;
    int r=0;
    int c=0;
    int dir=0;
    while(r>=0 && r<mat.length && c>=0 && c<mat[0].length){
        dir=(mat[r][c]+dir)%4;
        if(dir==0){
            c++;
            if(c==col){
                c--;
                break;
            }
        }
        else if(dir==1){
            r++;
            if(r==row){
                r--;
                break;
            }
        }
        else if(dir==2){
            c--;
            if(c==-1){
                c++;
                break;
            }
        }
        else{
            r--;
            if(r==-1){
                r++;
                break;
            }
        }
    
    }
    System.out.println(r);
    System.out.println(c);
}
}