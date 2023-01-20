package practice1;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c=0;
		for(int j=2;j<n;j++)
		{
		for(int i=2;i<=Math.sqrt(j);i++)
		{
			if(j%i==0)
			{
				c=c+1;
			}
		}
		if(c==0)
		{
			System.out.println("Prime"+j);
			c=0;
		}
		else {
			System.out.println("Not Prime"+j);
			c=0;
		}
		}
	}

}
