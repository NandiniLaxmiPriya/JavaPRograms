package javaio;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class CreateTextFile {
	private Formatter output;
	
	public void openFile()
	{
		try
		{
			output = new Formatter("clie.txt");
		}catch(SecurityException tes)
		{
			System.out.println(tes);
			System.exit(1);
		}catch(FileNotFoundException e)
		{
			System.out.println(e);
			System.exit(1);
		}
	}
	public void addRecord()
	{
		Scanner sc = new Scanner(System.in);
		AccountRecord rec = new AccountRecord();
		System.out.printf("%s\n","Enter account no, first name, last name, balance");
		while(sc.hasNext())
		{
			try {
			rec.setAccount(sc.nextInt());
			rec.setFirstName(sc.next());
			rec.setLastName(sc.next());
			rec.setBalance(sc.nextDouble());
			if(rec.getAccount()>0)
			{
				output.format("%d %s %s %f\n",rec.getAccount(),rec.getFirstName(),rec.getLastName(),rec.getBalance());
			}
			else {
				System.out.println("account number must be greater than 0");
			}
			}catch(FormatterClosedException fce)
			{
			System.err.println("Error writing to a file");
			return;
			}catch(NoSuchElementException nse)
			{
				System.err.println("Invalid please try again");
				sc.nextLine();
			}
			System.out.printf("%s\n","Enter account no, first name, last name, balance");
		}
	}
	public void closeFile()
	{
		if(output!=null)
		{
		output.close();
		}
	}
}
