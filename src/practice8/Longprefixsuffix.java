package practice8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;

public class Longprefixsuffix {

	public static int lengthOf(String s)
	{
		
		HashSet<String> hs = new HashSet<>();
		HashMap<String,Integer> hm = new HashMap<>();
		//StringBuilder rev = new StringBuilder(s);
	//	rev.reverse();
	//	String rever = rev.toString();
		
	//	if(!rever.equals(s))
	//	{
			
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
			//	System.out.println(s.substring(i,j));
				String str=s.substring(i,j);
				if(hm.containsKey(str))
				{
					int k = hm.get(str);
					k=k+1;
					hm.put(str, k);
				}else {
					hm.put(str, 1);
				}
			}
		}
	//	System.out.println(hm);
		int max=0;
		for(Map.Entry<String,Integer> et : hm.entrySet())
		{
			if(et.getValue()>1)
			{
					hs.add(et.getKey());
			}
		}
		//System.out.println(hs+" "+max);
		String ans="";
		for(String m : hs)
		{
			
			if(max<m.length())
			{
				max=m.length();
				ans=m;
			}
		}
	//	System.out.println(ans);
		
		return ans.length();
	//	}else {
	//		return s.length()-1;
	//	}
		
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		int t =Integer.parseInt(br.readLine());
		int ans[] = new int[t];
		for(int i=0;i<t;i++)
		{
			String s = br.readLine();
			ans[i]=lengthOf(s);
		}
		System.out.println("output");
		for(int i=0;i<t;i++)
		{
			System.out.println(ans[i]);
		}
		}
		catch(NumberFormatException nse)
		{
			System.out.println("check input");
		}catch(InputMismatchException nse)
		{
			System.out.println("check input");
		}
		
	}

}
