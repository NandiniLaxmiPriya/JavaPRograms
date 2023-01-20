package javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;

public class SurveyRead {

	Scanner input ;
	Formatter output;
	public void openn()
	{
		try
		{
			input = new Scanner(new File("numbers.txt"));
			output = new Formatter("output.txt");
			
		}catch(FileNotFoundException fnfe)
		{
			System.err.println("error opening file");
			System.exit(1);
		}catch(SecurityException e)
		{
			System.err.println("error writing failed");
			System.exit(1);
		}
	}
	public void readAdd()
	{
		try {
			Survey sy = new Survey();
			System.out.printf("%5s %5s\n","SurveyNo","SurveyAccuracy");
			while(input.hasNext())
			{
				sy.setSurveyNo(input.nextInt());
				sy.setSurveyAccuracy(input.nextInt());
				output.format("%d %d\n",sy.getSurveyNo(),sy.getSurveyAccuracy());
				System.out.printf("%5s %5s\n",sy.getSurveyNo(),sy.getSurveyAccuracy());
			}
		}catch(FormatterClosedException fce)
		{
			System.err.println("error writing into file");
			System.exit(1);
		}
	}
	public void closee()
	{
		if(input!=null && output!=null)
		{
			input.close();
			output.close();
		}
	}
}
