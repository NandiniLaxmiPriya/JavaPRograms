package practice1;
import java.util.Scanner;
public class SquareAsterisk {

	public static void printSquare(int side,char type)
	{
		for(int i=0;i<side;i++)
		{
			for(int j=0;j<side;j++)
			{
				System.out.print(type);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of square");
		int n =  sc.nextInt();
		System.out.println("Enter type of square");
		char type = sc.next().charAt(0);
		printSquare(n,type);
		
		

}
}
