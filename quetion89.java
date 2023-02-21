import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    printStairPaths(n,"");
    }

    public static void printStairPaths(int n, String path) {
        if(n==0){
            System.out.println(path);
            return;
        }
        for(int s=1;s<=3&&n-s>=0;s++){
            printStairPaths(n-s,path+s);
        }    }

}