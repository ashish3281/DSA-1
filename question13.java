import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int row=1;
        int nst=1;
        int val=1;
        while(row<=n){
            int cst=1;
            int cval=val;
            while(cst<=nst){
                if(cst==1  || cst==nst){
                System.out.print(cval+"\t");
                }
                else if(cst==2 ||cst==nst-1){
                    System.out.print(row-1+"\t");
                }
                else{
                    System.out.print(((row-1)*(row-1-1))/2+"\t");
                }
                cst+=1;
            }
            row+=1;
            nst+=1;
            System.out.println();
        }

    }
}