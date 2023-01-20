package practice2;

public class BarPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,1,4,1,3,4,2,1,2,3};
		for(int i = 0; i<a.length;i++)
		{
			if(i==10)
			{
				System.out.printf("%5d:",100);
			}
			else {
				System.out.printf("%02d-%02d:",(i*10),(9+i*10));
			}
			for(int j=0;j<a[i];j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
