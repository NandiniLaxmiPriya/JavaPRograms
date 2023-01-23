package practice4;

import java.util.Arrays;
import java.util.Stack;

public class Q2ca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String asr = "ma,da m";
		asr = asr.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(asr);
		Stack<String> sk = new Stack<>();
		for(int i=0;i<asr.length();i++)
		{
			sk.push(String.valueOf(asr.charAt(i)));
		}
		System.out.println(sk);
		String rev="";
		while(sk.size()>0)
		{
			String r= sk.pop();
			rev = rev+r;
		}
		System.out.println(rev);
		System.out.println((asr.equals(rev))?"Palindrome":"Not a palindrome");
	}

}
