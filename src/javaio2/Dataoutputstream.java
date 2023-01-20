package javaio2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dataoutputstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fs = new FileOutputStream("f3.txt");
		DataOutputStream dos = new DataOutputStream(fs);
		dos.write(65);
		dos.flush();
		dos.close();
		FileInputStream fis = new FileInputStream("f3.txt");
		DataInputStream dis = new DataInputStream(fis);
		char c = (char)dis.read();
		System.out.println(c);
		dis.close();
	}

}
