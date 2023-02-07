package TwoDArray;

import java.util.*;

public class question54{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[][]mat=new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            mat[i][j]=sc.nextInt();
        }
    }
    
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        System.out.print(mat[i][j]+" ");
    }
    System.out.println();
}
 }

}