package practice7;

public class NFib {
	public static int nthfib(int n)
	{
		int fib1=0;
		int fib2=1;
		int sum=0;
		if(n==1)
		{
			return 0;
		}
		else if(n==2)
		{
			return 1;
		}
		else {
		for(int i=3;i<=n;i++) {
			sum=fib1+fib2;
			fib1=fib2;
			fib2=sum;
		}
		return fib2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println(nthfib(n));
	}

}
