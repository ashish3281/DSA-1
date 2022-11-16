import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
		int nst = n;
		int row = 1;
		
		while(row <= n)
		{
		
			int cst = 1;
			
			while(cst <= nst)
			{
//				if(row == 1 || row == n || cst == 1|| cst == nst)
				if(cst == row || cst + row == n+1){
				System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
				cst+=1;
			}
			
			row += 1;
			System.out.println();
		}

    }
}