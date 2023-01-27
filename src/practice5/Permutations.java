package practice5;

public class Permutations {

	public static void permutate(String s) {
		int iterations = fact(s);
		int len =s.length();
		for(int i=0;i<iterations;i++)
		{
			StringBuilder sb = new StringBuilder(s);
			int iter = i;
			for(int div=len;div>=1;div--)
			{
				int q = iter/div;
				int r = iter%div;
				System.out.print(sb.charAt(r));
				sb.deleteCharAt(r);
				iter=q;
			}
			
			System.out.println();
		}
	}
	public static int fact(String s)
	{
		int n=s.length();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		permutate(s);
	}

}
