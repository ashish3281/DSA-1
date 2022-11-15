import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int row=1;
        int nst=n;
        while(row<=n){
            int cst=1;
            while(cst<=nst){
                System.out.print("*\t");
                cst+=1;
            }
            row+=1;
            nst-=1;
            System.out.println();
        }

    }
}