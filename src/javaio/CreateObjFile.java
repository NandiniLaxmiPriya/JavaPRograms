package javaio;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateObjFile {

	private ObjectOutputStream output;
	
	public void openFile()
	{
		try {
			output = new ObjectOutputStream(new FileOutputStream("client2.ser"));
		}catch(IOException io)
		{
			System.err.println("Error opening or creating file");
			System.exit(1);
		}
	}

	public void addObjRecords()
	{
	Scanner sc = new Scanner(System.in);
	int account;
	String firstName;
	String lastName;
	double balance;
	AccountSerializable rec;
	System.out.printf("%s\n","Enter account no, first name, last name, balance ");
	while(sc.hasNext())
	{
		try {
		
		account = sc.nextInt();
		firstName = sc.next();
		lastName = sc.next();
		balance = sc.nextDouble();
		rec = new AccountSerializable(account,firstName,lastName,balance);
		output.writeObject(rec);
		//System.out.printf("%d %s %s %f\n",rec.getAccount(),rec.getFirstName(),rec.getLastName(),rec.getBalance());
		}catch(IOException io)
		{
			System.err.print("error reading into file");
			System.exit(1);
		}catch(NoSuchElementException nse)
		{
			System.err.print("Invalid input");
			sc.nextLine();
		}
		System.out.printf("%s\n","Enter account no, first name, last name, balance ");
	}
	}
	public void closeFile()
	{
		try
		{
			if(output!=null)
			{
				output.close();
			}
		
		}catch(IOException io)
		{
			System.err.println("Error opening or creating file");
			System.exit(1);
		}
	}
}
