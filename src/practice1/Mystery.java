package practice1;

public class Mystery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row =10;
		int col;
		while(row>=1)
		{
			col=1;
			while(col<=10)
			{
				System.out.print(row%2==1 ? "<": ">");
				col+=1;
			}
			System.out.println();
			row-=1;
		}

	}

}
