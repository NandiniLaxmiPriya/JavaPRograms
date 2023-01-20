package practice3;
import java.util.Scanner;
import java.util.HashMap;
public class Anagram {
	public static void check(String ow,String aw)
	{
		HashMap<String,Integer> h1 = new HashMap<>();
		HashMap<String,Integer> h2 = new HashMap<>();
		ow = ow.toLowerCase();
		aw = aw.toLowerCase();
		System.out.println(ow +" "+aw);
		aw=aw.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(aw);
		for(int i=0;i<ow.length();i++)
		{
			if(h1.containsKey(String.valueOf(ow.charAt(i))))
			{
				int k = h1.get(String.valueOf(ow.charAt(i)));
				k=k+1;
				h1.put(String.valueOf(ow.charAt(i)),k);
			}
			else {
				h1.put(String.valueOf(ow.charAt(i)),1);
			}
		}
		for(int i=0;i<aw.length();i++)
		{
			if(h2.containsKey(String.valueOf(aw.charAt(i))))
			{
				int k = h2.get(String.valueOf(aw.charAt(i)));
				k=k+1;
				h2.put(String.valueOf(aw.charAt(i)),k);
			}
			else {
				h2.put(String.valueOf(aw.charAt(i)),1);
			}
		}
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h1.equals(h2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ow = "Software";
		String aw = "soft,ware";
		check(ow,aw);
	}

}
