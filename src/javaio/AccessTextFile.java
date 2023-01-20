package javaio;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class AccessTextFile {

	
	Scanner input;
	public void openFile()
	{

	try
	{
		input = new Scanner(new File("clie.txt"));
	}catch(FileNotFoundException fnfe)
	{
		System.err.print("error opening file");
		System.exit(1);
	}
	}
	public void readRecords()
	{
		AccountRecord rec = new AccountRecord();
		System.out.printf("%5s %15s %15s %10s\n","Account","First Name","Last Name","Balance");
		try {
			while(input.hasNext())
			{
				rec.setAccount(input.nextInt());
				rec.setFirstName(input.next());
				rec.setLastName(input.next());
				rec.setBalance(input.nextDouble());
				System.out.printf("%-5d %15s %15s %15.2f\n",rec.getAccount(),rec.getFirstName(),rec.getLastName(),rec.getBalance());
				
			}
		}catch(IllegalStateException iie)
		{
			System.err.print("error reading from file");
			System.exit(1);
		}
		catch(NoSuchElementException nse)
		{
			System.err.print("error inputing from file");
			System.exit(1);
		}
	}
	
	
	public void closeFile()
	{
		if(input!=null)
		{
			input.close();
		}
	}
}
