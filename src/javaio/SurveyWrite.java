package javaio;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class SurveyWrite {
	
	Formatter output ;
	public void openInToFile()
	{
		try
		{
			output = new Formatter("numbers.txt");
			
		}catch(FileNotFoundException fnfe)
		{
			System.err.print("error opening file");
			System.exit(1);
		}catch(SecurityException e)
		{
			System.err.print("error no acess for writing into file");
			System.exit(1);
		}
	}
	public void readSurvey()
	{
		Scanner sc = new Scanner(System.in);
		Survey sy = new Survey();
		System.out.printf("%s\n","Enter survey no, survey accuracy");
		while(sc.hasNext())
		{
			try {
			int no;
			int accuracy;
			sy.setSurveyNo(sc.nextInt());
			sy.setSurveyAccuracy(sc.nextInt());
			output.format("%d %d\n",sy.getSurveyNo(),sy.getSurveyAccuracy());
			}catch(FormatterClosedException fc)
			{
				System.err.print("error writing into file");
				System.exit(1);
			}catch(NoSuchElementException nse)
			{
				System.err.println("Input invalid");
				sc.nextLine();
			}
			System.out.printf("%s\n","Enter survey no, survey accuracy");
		}
	}
	public void closeInFile()
	{
		if(output!=null)
		{
			output.close();
		}
	}
	
}
