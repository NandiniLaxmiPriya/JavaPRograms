package practice5;

public class LongestCommonSubsequence {
	public static int lcs(char X[],char Y[],int m,int n )
	{
		if(m==0 || n==0)
			return 0;
		if(X[m-1]==Y[n-1]) {
			return 1+lcs(X,Y,m-1,n-1);
		}
		else {
			return Math.max(lcs(X,Y,m,n-1),lcs(X,Y,m-1,n));
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "zjveiiwvc";
		String s2 = "cvwiievjz";
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int m = s1.length();
		int n = s2.length();
		//int dp[][]= new int[m+1][n+1];
		int len = lcs(ch1,ch2,m,n);
		System.out.println(lcs(ch1,ch2,m,n));
		System.out.println(m-len);
	
		/*	for(int i=0;i<m+1;i++)
		{
			for(int j=0;j<n+1;j++)
			{
				dp[i][j]=-1;
			}
		}
		int len=lcs(ch1,ch2,m,n,dp);
		System.out.println(lcs(ch1,ch2,m,n,dp));
		for(int i=0;i<m+1;i++)
		{
			for(int j=0;j<n+1;j++)
			{
				System.out.print(dp[i][j]+"  ");
			}
			System.out.println();
		}
		
		int i=m;
		int j=n;
		
		while(i>0 && j>0)
		{
			if(s1.charAt(i-1)==s2.charAt(j-1))
			{
			//	res[i]=String.valueOf(s1.charAt(i-1));
				i=i-1;
				j=j-1;
			}else if(dp[i-1][j]>dp[i][j-1])
			{
				i=i-1;
			}
			else {
				j=j-1;
			}
		} */
	
	}

}
