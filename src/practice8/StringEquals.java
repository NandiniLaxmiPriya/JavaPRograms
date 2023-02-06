package practice8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class StringEquals {

	public static boolean check(String s,HashSet<String> hs)
	{
		int n=s.length();
		if(n==0)
		{
			return true;
		}
		for(int i=1;i<=n;i++)
		{
			if(hs.contains(s.substring(0,i)) && check(s.substring(i,n),hs)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		int t = Integer.parseInt(br.readLine());
		int ans[]= new int[t];
		for(int i=0;i<t;i++)
		{
			int n = Integer.parseInt(br.readLine());
			String sdict =br.readLine();
			String s = br.readLine();
			String sarr[] =sdict.split(" ");
			HashSet<String> hs = new HashSet<>();
			for(int j=0;j<sarr.length;j++)
			{
				hs.add(sarr[j]);
			}
			
			if(check(s,hs))
			{
				ans[i]=1;
			}
			else {
				ans[i]=0;
			}
		}
		for(int i=0;i<t;i++)
		{
			System.out.println(ans[i]);
		}
		}catch(NumberFormatException nse)
		{
			System.out.println("check input");
		}
	}

}
