package practice7;
import java.util.Scanner;
public class RevInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be reversed");
		int n = sc.nextInt();
		int res = n;
		int sum=0;
		while(n>0)
		{
			int r = n%10;
			sum=sum*10+r;
			n=n/10;
		}
		
			System.out.println(sum);
		
	}

}
