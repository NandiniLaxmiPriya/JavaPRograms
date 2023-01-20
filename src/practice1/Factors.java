package practice1;
import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int step = n%2==0 ? 1 : 2;
		for(int j=1;j<n;j+=step)
		{
			if(n%j==0)
			{
				System.out.println(j);
			}
		}

	}

}
