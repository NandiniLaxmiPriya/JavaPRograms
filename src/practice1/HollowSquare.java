package practice1;
import java.util.Scanner;
public class HollowSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		try{
		
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(i==0 || i==n-1)
		        {
		            System.out.printf("%-3s","*");
		        }
		        else{
		        if(j==0)
		        {
		            System.out.printf("%-3s","*");
		        }
		        else if(j==n-1)
		        {
		             System.out.printf("%-3s","*");
		        }
		        else{
		            System.out.printf("%-3s"," ");
		        }
		        }
		    }
		    System.out.println();
		}
	}
		finally
		{
			sc.close();
		}
	}

}
