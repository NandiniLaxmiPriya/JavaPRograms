package practice1;
import java.util.*;
public class GameOfChances {
	private static Random rm = new Random();
	private enum status {
		WON,
		LOSE,
		CONTINUE
	}
	public static int roldice()
	{
		int d1 = 1 + rm.nextInt(6);
		int d2 = 1 + rm.nextInt(6);
		int sum = d1+d2;
		System.out.println(sum);
		return sum;
		
	}
	public static void main(String[] args) {

		status s;
		int point=0;
		int sum =roldice();
		switch(sum)
		{
		case 7:
		case 11:
			s=status.WON;
			break;
		case 2:
		case 3:
		case 12:
			s=status.LOSE;
			break;
		default:
			s=status.CONTINUE;
			point = sum;
		}
		
		while(s==status.CONTINUE)
		{
			sum=roldice();
			if(sum==point)
			{
				s=status.WON;
			}
			else {
				if(sum==7)
				{
					s=status.LOSE;
				}
			}
		}
		if(s==status.WON)
		{
			System.out.println("Player wins");
		}
		else if(s==status.LOSE)
		{
			System.out.println("Player lose");
		}
	}

}
