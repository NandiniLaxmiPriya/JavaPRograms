package exceptionHandle;
import java.util.Scanner;
class AgeNotvalid extends Exception{
	public AgeNotvalid(String s)
	{
		super(s);
	}
}
public class CustomException {
	public static void checkAge(int age) throws AgeNotvalid
	{
		try
		{
			if(age>18)
			{
				System.out.println("Valid");
			}
			else {
				throw new AgeNotvalid("Less than 18");
			}
		}catch(AgeNotvalid a)
		{
			a.printStackTrace();
			System.out.println(a.getMessage());
		}
	}

	public static void main(String[] args) throws AgeNotvalid {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		checkAge(sc.nextInt());
	}

}
