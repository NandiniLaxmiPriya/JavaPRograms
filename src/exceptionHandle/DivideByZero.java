package exceptionHandle;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivideByZero {

	public static void divide(int a,int b) throws ArithmeticException
	{
		int ans = a/b;
		System.out.println("the answer is"+ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a, b values");
			int a = sc.nextInt();
			int b = sc.nextInt();
			divide(a,b);
			System.exit(0);
		}catch(ArithmeticException e)
		{
			System.err.print(e);
			System.out.println("/ divide by zero");
		}
		catch(InputMismatchException e)
		{
			System.err.print(e);
			System.out.println("check input");
		}finally
		{
			System.out.println("hehe");
		}
	}

}
