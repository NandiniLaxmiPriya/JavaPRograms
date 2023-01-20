package javaio2;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Byteoutputstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileOutputStream fout1 = new FileOutputStream("f1.txt");
		FileOutputStream fout2 = new FileOutputStream("f2.txt");
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		byte[] b = {65,66,67,68,69,70};
		bout.write(b);
		bout.writeTo(fout1);
		bout.writeTo(fout2);
		bout.close();
		}
		catch(IOException io)
		{
			System.out.println(io);
		}
	}

}
