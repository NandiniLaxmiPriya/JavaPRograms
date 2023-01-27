package practice5;

public class OpoLCSubstring {
	public static int lcss(char X[],char Y[],int m, int n,int count)
	{
		if(m==0 || n==0)
			return count;
		if(X[m-1]==Y[n-1])
			return lcss(X,Y,m-1,n-1,count+1);
		else
			return Math.max(lcss(X,Y,m,n-1,0),lcss(X,Y,m-1,n,0));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "spaceeeer";
		String s2 = "spaceeee";
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int m=s1.length();
		int n=s2.length();
		System.out.println(lcss(ch1,ch2,m,n,0));
		
	}

}
