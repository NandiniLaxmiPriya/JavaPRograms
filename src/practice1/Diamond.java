package practice1;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		int mid = n/2;
		for(int i=0;i<n-mid;i++)
		{
			for(int j=0;j<mid-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=mid-i;j<=mid+i;j++)
			{
				System.out.print("*");
			}
			for(int j=mid+i;j<n;j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		int k=1;
		for(int i=mid+1;i<n;i++)
		{
			for(int j=0;j<k;j++)
			{
				System.out.print(" ");
			}
			for(int j=k;j<n-k;j++)
			{
				System.out.print("*");
			}
			for(int j=n-k;j<k;j++)
			{
				System.out.print(" ");
			}
			k+=1;
			System.out.println();
		}
	}

}
