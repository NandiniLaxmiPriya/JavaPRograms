package practice1;
import java.util.Scanner;
import java.util.Random;
public class TossingCoin {
	private static enum face
	{
		HEAD,
		TAIL
	}
	private static int head=0;
	private static int tail=0;
	public static void tossCoin()
	{
		Random rm = new Random();
		int f = rm.nextInt(2);
		face facee;
		if(f==0)
		{
			tail+=1;
			facee=face.TAIL;
		}
		else {
			head+=1;
			facee=face.HEAD;
		}
		System.out.println("Coin tossed its :"+facee);
	}
	public static void flip()
	{
		System.out.println("Number of tails occured"+tail);
		System.out.println("Number of heads occured"+head);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.printf("%2s\n %2s\n %2s\n","Enter 1: Toss Coin", "Enter 2: Flip","Enter 0: Stop");
			int x = sc.nextInt();
			switch(x)
			{
			case 1:
				tossCoin();
				break;
			case 2:
				flip();
				break;
			default:
				System.out.println("--END--");
			}
			if(x==0)
			{
				break;
			}
		}

	}

}
