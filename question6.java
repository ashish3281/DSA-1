import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
 int n=scn.nextInt();
 int row=1;
 int nsp=1;
 int nst=n/2+1;
 while(row<=n){
     int cst=1;
     while(cst<=nst){
         System.out.print("*\t");
         cst+=1;
     }
     int csp=1;
     while(csp<=nsp){
         System.out.print("\t");
         csp+=1;
     }
      cst=1;
     while(cst<=nst){
         System.out.print("*\t");
         cst+=1;
     }
      
     if(row<n/2+1){
         nsp+=2;
         nst-=1;
         
     }
     else{
         nst+=1;
         nsp-=2;
     }
     row+=1;
     System.out.println();
     
 }

    }
}