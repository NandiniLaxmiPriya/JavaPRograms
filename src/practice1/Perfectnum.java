package practice1;

public class Perfectnum {

	public static void printPerfect()
	{
		int sum=0;
		String fact="";
		for(int i=1;i<1000;i++)
		{
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
					fact=fact+" "+String.valueOf(j);
				}
			}
			if(check(sum,i))
			{
				System.out.printf("%d %s\n",i,fact);
				fact="";
				sum=0;
			}
			else {
				fact="";
				sum=0;
			}
		}
	}
	public static boolean check(int s,int n)
	{
		if(s==n)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printPerfect();
	}

}
