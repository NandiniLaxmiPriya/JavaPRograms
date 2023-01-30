package practice5;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,3};
		int c=1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+c;j<=a.length;j++)
			{
				for(int k=i;k<j;k++)
				{
					System.out.print(a[k]);
				}
				if(j<=a.length && c<=a.length)
				{
					c=c+1;
					j=i+c;
				}
				System.out.println();
			}
			
		}
	}

}
