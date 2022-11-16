import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int row=1;
     int nst=1;
     int val=1;
     while(row<=n){
         int cst=1;
         int cval=val;
         while(cst<=nst){
        System.out.print(cval+"\t");
             cst+=1;
             cval+=1;
         }
         row+=1;
         nst+=1;
         val=cval;
         System.out.println();
     }

    }
}