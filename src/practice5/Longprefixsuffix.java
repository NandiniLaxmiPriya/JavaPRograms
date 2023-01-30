package practice5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Longprefixsuffix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababab";
		HashSet<String> hs = new HashSet<>();
		HashMap<String,Integer> hm = new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				System.out.println(s.substring(i,j));
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
		System.out.println(hm);
		int max=0;
		for(Map.Entry<String,Integer> et : hm.entrySet())
		{
			if(et.getValue()>1)
			{
					hs.add(et.getKey());
			}
		}
		System.out.println(hs+" "+max);
		String ans="";
		for(String m : hs)
		{
			
			if(max<m.length())
			{
				max=m.length();
				ans=m;
			}
		}
		System.out.println(ans);
		
	}

}
