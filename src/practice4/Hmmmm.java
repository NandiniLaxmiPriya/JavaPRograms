package practice4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;

public class Hmmmm {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String digits ="2346";
		LinkedList<String> output = new LinkedList<>();
		String[] map = {"0","1","abc","def","ghi","jkl","mno","prs","tuv","wxy"};
		output.add("");
		
		for(int i=0;i<digits.length();i++)
		{
			int num = Integer.parseInt(String.valueOf(digits.charAt(i)));
			while(output.peek().length()==i)
			{
				String permut = output.remove();
				for(char c: map[num].toCharArray())
				{
					output.add(permut+c);
				}
			}
		}
		System.out.println(output);
		FileOutputStream fs = new FileOutputStream("fileoo.txt");
		PrintStream ps = new PrintStream(fs);
		ps.println(digits);
		ps.println(output);
		

	}

}
