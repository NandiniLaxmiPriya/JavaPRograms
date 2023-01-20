package javaio;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;

public class Printstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("hello.txt");
		PrintStream pts = new PrintStream(fout);
		pts.println("Hellooooo");
	//	pts.println(45);
		pts.println("hmmm");
		pts.close();
		Reader rd = new FileReader("hello.txt");
		int i = rd.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i = rd.read();
		}
	}

}
