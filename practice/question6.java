import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pos=0;
        int zero=0;
        int neg=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos++;
            }
            else if(arr[i]==0){
                zero++;
            }
            else{
                neg++;
            }
        }
        System.out.println(pos/(double)n);
        System.out.println(neg/(double)n);
        System.out.println(zero/(double)n);
    }
}
