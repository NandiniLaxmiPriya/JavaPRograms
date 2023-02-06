package practice5;

import java.util.HashSet;

public class StringEqualss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IlikeMango";
	
		s=s.toLowerCase();
		String a = "i like sam sung samsung mobile ice cream icecream man go mango";
		String arr[]=a.split(" ", -2);
		String ans="";
		
		HashSet<String> hs = new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		System.out.println(hs);
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				String str = s.substring(i,j);
			//	System.out.println(str);
				if(hs.contains(str))
				{
					if(!ans.contains(str))
					{
					ans=ans+str;
					}
				}
			}
		}
		System.out.println(ans);
	/*	for(int i=0;i<arr.length;i++)
		{
			//System.out.println(i);
			if(s.contains(arr[i]))
			{
				ans=ans+arr[i];
			}
		}
		System.out.println(ans);
		if(s.contains(ans) || ans.contains(s))
		{
			System.out.println(1);
		}else {
			System.out.println(0);
		}*/
	}

}
