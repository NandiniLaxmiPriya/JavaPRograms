package javaio2;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharaarRW {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CharArrayWriter caw = new CharArrayWriter();
		caw.write("Welcometohelloworld");
		FileWriter fs = new FileWriter("f1.txt");
		FileWriter fs2 = new FileWriter("f2.txt");
		caw.writeTo(fs2);
		caw.writeTo(fs);
		fs.close();
		fs2.close();
		caw.close();
		char c[]= {'j','a','v','a','e','e'};
		CharArrayReader car = new CharArrayReader(c,1,4);
		int i = car.read();
		while(i!=-1)
		{
			System.out.println((char)i);
			i = car.read();
		}
	}

}
