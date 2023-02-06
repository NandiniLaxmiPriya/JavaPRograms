
package practice7;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.util.HashSet;

public class Uniquee {
	Reader rd;
	OutputStream wr;
	PrintStream pr ;
	public void checkUnique()
	{
		
		HashSet<String> hs = new HashSet<>();
		
		try {
			
		rd = new FileReader("/home/beehyv/input.txt");
		int data = rd.read();
		System.out.println("The character in file are");
		while(data!=-1)
		{
			if(data==32 || data==10)
			{
				// to omit space and \n character data
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
		System.out.println("The unique characters are "+hs.size());
		 wr = new FileOutputStream("output.txt");
		 pr = new PrintStream(wr);
		pr.print(hs.size());
		}catch(IOException e)
		{
			System.err.println(e);
		}
	}
	public void closeFile() throws IOException 
	{
		try
		{
			if(rd!=null && wr!=null && pr!=null)
			{
				rd.close();
			}
		
		}catch(IOException io)
		{
			System.err.println("Error opening or creating file");
			System.exit(1);
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Uniquee uq = new Uniquee();
		uq.checkUnique();
		uq.closeFile();
	}

}
