package practice5;

public class LongestCommonSubsequence {
	public static int lcs(char X[],char Y[],int m,int n)
	{
		if(m==0 || n==0)
			return 0;
		if(X[m-1]==Y[n-1])
			return 1+lcs(X,Y,m-1,n-1);
		else
			return Math.max(lcs(X,Y,m,n-1),lcs(X,Y,m-1,n));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "spacer";
		String s2 = "space";
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int m = s1.length();
		int n = s2.length();
		System.out.println(lcs(ch1,ch2,m,n));
	}

}
