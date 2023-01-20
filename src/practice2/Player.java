package practice2;
import java.util.Scanner;
public class Player {
	private String playerName;
	Player(String playerName)
	{
		this.playerName = playerName;
	}
	public  int GuessNum()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Guess the number "+playerName);
		int guess = sc.nextInt();
		if(guess >=0 && guess<=9)
		{
			return guess;
		}
		else {
			throw new IllegalArgumentException("Read the rules properly");
		}
	}
	public String toString()
	{
		return String.format("%s",playerName);
	}
}
