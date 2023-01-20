package practice1;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 3;
		int max = Math.max(a, b);
		if(a!=max)
		{
			b=a;
			a=max;
		}
		System.out.println(a+" "+b);
		int r = 0;
		while(b!=0)
		{
			//System.out.println(a+" "+b+" "+r);
			r = a%b;
			a=b;
			b=r;
		}
		System.out.println(a);
	}

}
