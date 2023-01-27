package practice5;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sasmadam";
		HashMap<String,Integer> hm = new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				System.out.println(s.substring(i,j));
				String sub = s.substring(i,j);
				String res = "";
				for(int k=0;k<sub.length();k++)
				{
					res=String.valueOf(sub.charAt(k))+res;
				}
				if(res.equals(sub))
				{
				//	System.out.println(sub+"  palin ");
					hm.put(sub, sub.length());
				}
			}
		}
		//ollections.sort(hm);
		Integer max =0;
		String str="";
		for(Map.Entry<String,Integer> entry:hm.entrySet())
		{
			if(max<entry.getValue())
			{
				max=entry.getValue();
				str=entry.getKey();
			}
		}
		System.out.println(str+"longest palindrome");
	}

}
