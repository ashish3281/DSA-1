import java.io.*;
import java.util.*;

public class Main {

public static void main(String[] args) throws Exception {
Scanner scn=new Scanner(System.in);
String str=scn.next();
ArrayListss=gss(str);
System.out.println(ss);
}

public static ArrayList gss(String str) {
if(str.length()==0)
{ArrayListba=new ArrayList<>();
ba.add("");
return ba;
}
char ch=str.charAt(0);
String ros=str.substring(1);
ArrayListrans=gss(ros);
ArrayListmyans=new ArrayList<>();
for(int i=0;i myans.add(rans.get(i));
}
for(int i=0;i myans.add(ch+rans.get(i));
}

return myans;
}

}

OK
