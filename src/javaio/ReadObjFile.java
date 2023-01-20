package javaio;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.FileInputStream;
public class ReadObjFile {
	
	private ObjectInputStream input;
	public void openFile()
	{
		try {
			input = new ObjectInputStream(new FileInputStream("client2.ser"));
		}
		catch(IOException io)
		{
			System.err.print("error opening file");
			System.exit(1);
		}
	}
	
	public void readObjRecords()
	{
		AccountSerializable rec;
		System.out.printf("%10s %15s %15s %10s\n","Account no","FirstName","LastName","Balance");
		try {
			while(true)
			{
			rec = (AccountSerializable)input.readObject();
			System.out.printf("%10d %15s %15s %10.2f\n",rec.getAccount(),rec.getFirstName(),rec.getLastName(),rec.getBalance());
			}
		}catch(EOFException eof)
		{
			return;
		}
		catch(ClassNotFoundException cnfe)
		{
			System.err.print("class doesn't exists");
			System.exit(1);
		}catch(IOException io)
		{
			System.err.print("error opening file");
			System.exit(1);
		}
	}
	public void closeFile()
	{
		try
		{
			if(input!=null)
			{
				input.close();
			}
		}catch(IOException io)
		{
			System.err.print("Error closing file");
			System.exit(1);
		}
	}
}
