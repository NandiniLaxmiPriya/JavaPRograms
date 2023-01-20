package exceptionHandle;

import java.util.Scanner;

public class USeScoreException {
	
	public static void check(String testScore)throws ScoreException,NumberFormatException
	{
		try {
			
			
			int score = Integer.parseInt(testScore);
			if(score>100 || score<0)
			{
				throw new ScoreException("The score must be >= 0 and <= 100!");
			}
			else {
				System.out.println("That is a valid score."+score);
			}
			}catch(ScoreException e)
			{
				
				System.out.println(e.getMessage());
				
				//JOptionPane.showMessageDialog(f, e.getMessage());
				
			}catch(NumberFormatException e)
			{
				System.out.println(e);
				//JOptionPane.showMessageDialog(f,"You must enter a number for the score!");
				System.out.println("You must enter a number for the score!");
			}
	}


	public static void main(String[] args)throws ScoreException,NumberFormatException {
		// TODO Auto-generated method stub
	
		String testScore="";
		int con=0;
		String s="";
		while(true)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter test score");
		testScore = sc.next();
		
		check(testScore);
		System.out.println("Enter yes/y to continue or no/n to end");
		s=sc.next();
		if(s.equals("no") || s.equals("n")) {
			break;
		}
		}
		

	}

}
