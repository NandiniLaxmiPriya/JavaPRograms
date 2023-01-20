package javaio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("hello.txt");
		try
		{
		
		fos.write(65);
		String s="Hello";
		byte[] b =s.getBytes();
		fos.write(b);
		}catch(FileNotFoundException fnse)
		{
			System.out.println(fnse);
		}catch(IOException io)
		{
			System.out.println(io);
		}
		finally
		{
			fos.close();
			
		}
	}

}
