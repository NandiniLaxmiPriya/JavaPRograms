package practice7;

public class Factorial {

	public static void main(String args[])
	{
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
//		return fact;
		System.out.println(fact);
	}
}
