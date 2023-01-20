package practice1;
import java.util.Scanner;
public class SeparatingDigits {

	public static int quotient(int a,int b)
	{
		int div = a/b;
		//System.out.println(div);
		return div;
	}
	public static int remainder(int a,int b)
	{
		int div = a%b;
		//System.out.println(div);
		return div;
	}
	public static void sequence(int ab)
	{
		int newN=0;
		while(ab>0)
		{
			int r =remainder(ab,10);
			//System.out.printf("%2d",r);
			newN = newN*10 +r;
			ab=quotient(ab,10);
		}
		while(newN>0)
		{
			int r =remainder(newN,10);
			System.out.printf("%-3d",r);
			
			newN=quotient(newN,10);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//System.out.println(quotient(10,3));
		//System.out.println(remainder(10,3));
		System.out.println("Enter the number");
		int a = sc.nextInt();
		sequence(a);
	}

}
