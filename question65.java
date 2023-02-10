import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		for(int st=0;st<str.length();st++){
		    for(int et=st;et<str.length();et++){
		        String ss=str.substring(st,et+1);
		        if(isPalindrome(ss)==true){
		            System.out.println(ss);
		        }
		    }
		}
		
	}
	public static boolean isPalindrome(String str){
	    int l=0;
	    int r=str.length()-1;
	    while(l<=r){
	        char lch=str.charAt(l);
	        char rch=str.charAt(r);
	        if(lch!=rch){
	            return false;
	        }
	        l++;
	        r--;
	    }
	    return true;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}