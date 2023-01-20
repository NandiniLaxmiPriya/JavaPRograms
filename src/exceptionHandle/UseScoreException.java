package exceptionHandle;
import javax.swing.*;
public class UseScoreException {
	
	public static void check(String testScore,JFrame f)throws ScoreException,NumberFormatException
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
				JOptionPane.showMessageDialog(f, e.getMessage());
			//	System.exit(1);
				
			}catch(NumberFormatException e)
			{
				System.out.println(e);
				JOptionPane.showMessageDialog(f,"You must enter a number for the score!");
			//	System.exit(1);
			}
	}


	public static void main(String[] args)throws ScoreException,NumberFormatException {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		String testScore;
		String con;
		while(true)
		{
		testScore = JOptionPane.showInputDialog(f,"Enter Test Score");
		check(testScore,f);
		con = JOptionPane.showInputDialog(f,"Enter y/n");
		if(con.equals("n") || con.equals("no"))
		{
			System.exit(0);
		}
		}
	}

}
