package practice1;
import java.util.Scanner;
public class IntegerPower {

	public static int intPow(int base,int exponent)
	{
		int ans=1;
		for(int i=0;i<exponent;i++)
		{
			ans*=base;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base , Exponent");
		int base = sc.nextInt();
		int exponent = sc.nextInt();
		System.out.printf("%d %s %d %s %d",base,"^",exponent,"=",intPow(base,exponent));
	}

}
