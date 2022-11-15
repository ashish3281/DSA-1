import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int row=1;
        int nst=1;
        int nsp=n-1;
        while(row<=n){
            int csp=1;
            while(csp<=nsp){
                System.out.print("\t");
                csp+=1;
            }
            int cst=1;
            while(cst<=nst){
                System.out.print("*\t");
                cst+=1;
            }
            row+=1;
            nst+=1;
            nsp-=1;
            System.out.println();
        }

    }
}