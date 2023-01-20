package practice3;

public class Diamondpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int mid = n/2;
		int i=0;
		//System.out.println(mid);
		for(i=0;i<4;i++)
		{
			for(int j=0;j<mid-1-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=mid-1-i;j<=mid+i;j++)
			{
				System.out.print("-");
			}
			for(int j=mid+i+1;j<n;j++)
			{
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		if(i==4)
		{
		for(int j=0;j<10;j++)
		{
			System.out.print("-");
		}
		System.out.println();
		}
		int m=1;
		for(i=5;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(" ");
			}
			for(int k=m;k<n-m;k++)
			{
				System.out.print("-");
			}
			for(int j=n-m;j<n;j++)
			{
				System.out.print(" ");
			}
			m=m+1;
			System.out.println();
		}
	}

}
