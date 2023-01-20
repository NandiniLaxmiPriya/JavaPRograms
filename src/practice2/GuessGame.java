package practice2;
import java.util.Random;
import java.util.Scanner;
public class GuessGame {

	public enum Status{
		WON,
		LOSE
	}
	public void startGame()
	{
		Player p1 = new Player("Player 1");
		Player p2 = new Player("Player 2");
		Player p3 = new Player("Player 3");
		Random r = new Random();
		//r.setSeed(3);
		Status st1;
		Status st2;
		Status st3;
		int set = 1;
		int guess1=0;
		int guess2=0;
		int guess3=0;
		Scanner sc = new Scanner(System.in);
		while(set==1)
		{
		
		
		int rand = r.nextInt(10);
		try {
			guess1=p1.GuessNum();
			guess2=p2.GuessNum();
			guess3=p3.GuessNum();
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
			break;
		}
		if(rand==guess1)
		{
			st1=Status.WON;
			System.out.printf("%s %s \n",p1.toString(),st1);
		}
		else {
			st1=Status.LOSE;
			System.out.printf("%s %s \n",p1.toString(),st1);
		}
		if(rand==guess2)
		{
			st2=Status.WON;
			System.out.printf("%s %s \n",p2.toString(),st2);
		}
		else {
			st2=Status.LOSE;
			System.out.printf("%s %s \n",p2.toString(),st2);
		}
		if(rand==guess3)
		{
			st3=Status.WON;
			System.out.printf("%s %s \n",p3.toString(),st3);
		}
		else {
			st3=Status.LOSE;
			System.out.printf("%s %s \n",p3.toString(),st3);
		}
		if(st1==Status.LOSE || st2==Status.LOSE || st3==Status.LOSE)
		{
		System.out.println("Press 1 continue the guess and -1 to END");
		set=sc.nextInt();
		if(set==-1)
		{
			break;
		}
		}
		}
		
	}
}
