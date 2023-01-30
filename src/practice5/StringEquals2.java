package practice5;

import java.util.ArrayList;
import java.util.List;

public class StringEquals2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IlikeSamSungSamSungSungicee";
		
		s=s.toLowerCase();
		String a = "i like sam sung samsung mobile ice cream icecream man go mango";
		String arr[]=a.split(" ", -2);
		String ans="";
		List<String> hs = new ArrayList<>();
		for(String i:arr)
		{
			hs.add(i);
		}
		boolean dp[] = new boolean[s.length()+1];
		dp[0]=true;
		for(int i=0;i<=s.length();i++)
		{
			for(int j=0;j<i;j++)
			{
				if(dp[j]&&hs.contains(s.substring(j, i)))
				{
					dp[i]=true;
					break;
				}
			}
		}
		if(dp[s.length()])
		{
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
	}

}
