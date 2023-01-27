package practice5;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		String s1 = "spacer";
		String s2 = "space";
		HashMap<String,Integer> hm = new HashMap<>();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<=s1.length();j++)
			{
				String sub = s1.substring(i,j);
				if(s2.contains(sub))
				{
					hm.put(sub, sub.length());
				}
			}
		}
		System.out.println(hm);
		String res="";
		Integer max =0;
		for(Map.Entry<String,Integer> entry:hm.entrySet()) {
			if(max<entry.getValue())
			{
				max=entry.getValue();
				res=entry.getKey();
			}
		}
		System.out.println("The longest common substring is "+res);

	}

}
