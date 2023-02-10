import java.io.*;
import java.util.*;

public class Main {
    public static int factorial(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }
	public static void solution(String str){
		int len=str.length();
		int tper=factorial(len);
		for(int num=0;num<tper;num++){
		    StringBuilder oste=new StringBuilder(str);
		    StringBuilder perm=new StringBuilder("");
		    int temp=num;
		    for(int div=len;div>=1;div--){
		        int rem=temp%div;
		        temp=temp/div;
		        char ch=oste.charAt(rem);
		        oste.deleteCharAt(rem);
		        perm.append(ch);
		    }
		    System.out.println(perm);
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}