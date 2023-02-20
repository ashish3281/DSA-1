import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
 Scanner scn=new Scanner(System.in);
   int n=scn.nextInt();
   int m=scn.nextInt();
   ArrayList<String> path = getMazePaths(0,0,n-1,m-1);
    System.out.println(path);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
            if(sr==dr && sc==dc)
                {ArrayList<String>ba=new ArrayList<>();
ba.add("");
return ba;

    }
if(sr>dr || sc>dc)
    {ArrayList<String>ba=new ArrayList<>();
return ba;
    }
    Arraylist<String>hntd=getMazePaths(sr,sc+1,dr,dc);
    Arraylist<String>vntd=getMazePaths(sr+1,sc,dr,dc);
    ArrayList<String>myans=new ArrayList<>();
    for(int i=0;i<hntd.size();i++){
    myans.add('h'+hntd.get(i));
  }
  for(int i=0;i<vntd.size();i++){
    myans.add('v'+vntd.get(i));
  }
        return myans;
    }

}
