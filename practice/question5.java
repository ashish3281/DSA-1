import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int d1=0;
        int d2=0;
        
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 if(i==j){
                     d1=d1+arr[i][j];
                 }
                if(i == n-j-1){
                    d2=d2+arr[i][j];
                }
             }
         }
         System.out.println(Math.abs(d1-d2));
    }
}
