package javaio2;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Byteinputstream {

	public static void main(String[] args) throws IOException {
		byte[] b = {65,66,67,68,69,70};
		ByteArrayInputStream bin = new ByteArrayInputStream(b);
		
		int data = bin.read();
		while(data!=-1)
		{
			System.out.println((char)data);
			data=bin.read();
		}
	}

}
