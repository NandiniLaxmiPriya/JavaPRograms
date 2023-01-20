package javaio;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FIleinputsream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis = new FileInputStream("hello.txt");
		int i = fis.read();
		System.out.println((char)i);
		
		
		}catch(FileNotFoundException fnfe)
		{
			System.out.println(fnfe);
		}catch(IOException io)
		{
			System.out.println(io);
		}
	}

}
