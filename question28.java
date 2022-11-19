import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        for(int n=low;n<=high;n++){
          int counter=0;
          for(int i=2;i*i<=n;i++)
          {
              if(n%i==0){
                  counter++;
                  break;
              }
          }
          if(counter==0){
              System.out.println(n);
          }
         
        }
        
    }
}
 