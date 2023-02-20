public import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
   Scanner scn=new Scanner(System.in);
   int n=scn.nextInt();
   ArrayList<String> path=getStairPaths(n);
    System.out.println(path);
    }

public static ArrayList<String> getStairPaths(int n) {
        if(n==0)
    {ArrayList<String>ba=new ArrayList<>();
ba.add("");
return ba;

    }
if(n<0)
    {ArrayList<String>ba=new ArrayList<>();
return ba;
    }
ArrayList<String>pnm1=getStairPaths(n-1);
ArrayList<String>pnm2=getStairPaths(n-2);
ArrayList<String>pnm3=getStairPaths(n-3);
ArrayList<String>myans=new ArrayList<>();
for(int i=0;i<pnm1.size();i++){
    myans.add(1+pnm1.get(i));
  }
for(int i=0;i<pnm2.size();i++){
    myans.add(2+pnm2.get(i));
   }
for(int i=0;i<pnm3.size();i++){
    myans.add(3+pnm3.get(i));
    }
        return myans;
    }

}
 {
    
}
