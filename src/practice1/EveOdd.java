package practice1;
import java.util.Scanner;
public class EveOdd {

	public static boolean check(int a)
	{
		if(a%2==0)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int n=1;
		
		while(true)
		{
			System.out.println("enter num to check even or odd / or Enter -1 to exit");
			int a = sc.nextInt();
			if(a==-1)
			{
				break;
			}
			else
			{
				System.out.println(check(a));
			}
		}

	}

}
