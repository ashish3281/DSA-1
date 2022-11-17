import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
                              int row=1;
                              int nst=1;
                              int nsp=n/2+1;
                              int val=1;
                              while(row<=n){
                               int csp=1;
                               while(csp<nsp){
                                   System.out.print("\t");
                                   csp+=1;
                               }
                               int cst=1;
                               int cval=val;
                               while(cst<=nst){
                                   System.out.print(cval+"\t");
                                   cst+=1;
                                   if(cst<=nst/2+1){
                                       cval+=1;
                                   }
                                   else{cval-=1;}
                                   
                                  
                               }
                               if(row<n/2+1){
                                   nsp-=1;
                                   nst+=2;
                                   
                               }
                               else{
                                   nsp+=1;
                                   nst-=2;
                             
                               } 
                               row+=1;
                               if(row<=n/2+1){
                                   val++;
                               }
                               else{
                                   val--;
                               }
                              
                               
                               System.out.println();
                              }

    }
}