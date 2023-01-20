package javaio;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashSet;

public class Uniquee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		HashSet<String> hs = new HashSet<>();
		try {
			
		Reader rd = new FileReader("/home/beehyv/input.txt");
		int data = rd.read();
		while(data!=-1)
		{
			if(data==32 || data==10)
			{
				data=rd.read();
				continue;
			}
			else {
			//s=s+String.valueOf((char)data);
			hs.add(String.valueOf((char)data));
			System.out.print((char)data);
			data=rd.read();
			}
		}
		System.out.println();
		/*s.replaceAll("\\n", "");
		
		//System.out.print(s.length());
	for(int i=0;i<s.length();i++)
		{
			hs.add(String.valueOf(s.charAt(i)));
			System.out.println(s.charAt(i));
		}
	//	hs.remove(" ");
		System.out.println(hs);
		System.out.println(s);
		System.out.println((char)10);*/
		System.out.println(hs);
		System.out.println(hs.size());
		}catch(IOException e)
		{
			System.err.println(e);
		}
	}

}
