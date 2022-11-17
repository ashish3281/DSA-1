import java.util.*;

public class Main {

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n=scn.nextInt();
    int row=1;
    int nst=n;
    while(row <=n){
    int cst=1;
    while(cst<=nst){
        
        if(cst==1||cst==nst){
        System.out.print("*\t");
                
            }
        
    else if((cst==row||cst+row==n+1)&&row>n/2){
         System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
                cst+=1;
                
            }
        
        row+=1;
        System.out.println();
    }
    }

    }

    