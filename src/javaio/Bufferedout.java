package javaio;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Bufferedout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("hello.txt"));
			bout.write(70);
			bout.close();
			
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream("hello.txt"));
		int i = bin.read();
		System.out.println((char)i);
		bin.close();
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println(fnfe);
		}catch(IOException io)
		{
			System.out.println(io);
		}
	}

}
