package practice6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ioreversestring {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fr;
		try {
		/*FileOutputStream fs = new FileOutputStream("PracRev.txt");
		byte b[] = {65,66,67,68,69,70};
		fs.write(b);
		System.out.println("written into file");*/
		fr = new FileInputStream("PracRev.txt");
		int bb=fr.read();
		String ans="";
		
		while(bb!=-1)
		{
			ans=String.valueOf((char)bb)+ans;
			System.out.println((char)bb);
			bb=fr.read();
		}
		//StringBuilder br=new StringBuilder(ans);
		System.out.println(ans);
		}catch(FileNotFoundException fsfe)
		{
			fsfe.printStackTrace();
		}catch(IOException io)
		{
			io.printStackTrace();
		}
		
	}

}
