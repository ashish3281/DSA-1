import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int []a=new int[3];
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        int []b=new int[3];
        for(int j=0;j<3;j++){
            b[j]=sc.nextInt();
        }
        int sum=0;
        int sum1=0;
        for(int k=0;k<3;k++){
            if(a[k]>b[k]){
                sum++;
            }
            else if(a[k]<b[k]){
                sum1++;
            }
            else{
                
            }
        }
        System.out.print(sum+" "+sum1);
    }
}
