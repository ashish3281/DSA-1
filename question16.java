import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

         int n=scn.nextInt();
    int row=1;
    int nst=1;
    int nsp=2*n-3;
    int val=1;
    while(row<=n){
        int cval=val;
        int cst=1;
        while(cst<=nst){
            System.out.print(cval+"\t");
            cst+=1;
            cval+=1;
        }
        int csp=1;
        while(csp<=nsp){
            System.out.print("\t");
            csp+=1;
        }
        
        if(row==n){
            cst=row-1;
            while(cst>=1){
             System.out.print(cst+"\t");
             cst-=1;
            }
        }
        else{
            cst=row;
            while(cst>=1){
                System.out.print(cst+"\t");
                cst-=1;
            }
        }
      
        nsp-=2;
        nst+=1;
        row+=1;
        System.out.println();
    }

 }
}