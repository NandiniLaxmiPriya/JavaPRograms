package practice8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Subsets {

public static boolean checkbit(int n,int i)
	{
	return ((n>>i)&1)==1;
	}
public static LinkedList<String> subset(String a[],int n)throws ArrayIndexOutOfBoundsException
{
	ArrayList<String> subset = new ArrayList<>();
	int arr[] =new int[n];
	
	for(int i=0;i<n;i++)
	{
		arr[i]=Integer.parseInt(a[i]);
	}
	//subset.add(" ");
	Arrays.sort(arr);
	long power =(long)Math.pow(2,n);
	for(int i=0;i<power;i++)
	{
		String t="";
		for(int j=0;j<n;j++)
		{
			if(checkbit(i,j))
			{
				t+=(Integer.toString(arr[j])+"#");
			}
			if(!subset.contains(t) && t.length()>0)
			{
				subset.add(t);
			}
		}
	}
	//String one="";
		for (String s : subset) {
			s = s.replace('#',' ');
			s=s.substring(0,s.length()-1);
		//	if(s.length()==1)
			//{
				//one=one+s;
			//}
		//	System.out.print("("+s+")");
           
		}
		//System.out.println(subset);
	//	System.out.println();
		//to print in order
		TreeSet<String> hs = new TreeSet<>();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				String str=String.valueOf(arr[i])+" "+String.valueOf(arr[j]);
				if(!hs.contains(str))
				{
					hs.add(str);
				}
			}
		}
	//	System.out.println(hs);
		//System.out.println();
		LinkedList<String> hs2 = new LinkedList<>();
		for(String h: hs)
		{
			for(String s: subset)
			{
				s = s.replace('#',' ');
				s=s.substring(0,s.length()-1);
				
				
				if(String.valueOf(s.charAt(0)).equals(String.valueOf(h.charAt(0))) && s.contains(h))
				{
					String rs = "("+s+")";
					if(!hs2.contains(rs))
					{
					hs2.add(rs);
					}
					//System.out.print("("+s+")");
           
				}
				if(String.valueOf(s.charAt(0)).equals(String.valueOf(h.charAt(0))) && s.length()==1)
				{
					String rs = "("+s+")";
					if(!hs2.contains(rs))
					{
					hs2.add(rs);
					}
				}
			}
		}
		//for not identical elements in array
		for(String s: subset)
		{
			s = s.replace('#',' ');
			s=s.substring(0,s.length()-1);
			String val = "("+String.valueOf(s.charAt(0))+")";
			if(!hs2.contains(val) && s.length()==1)
			{
				hs2.add("("+s+")");
			}
		}
		//System.out.println(hs2);
		hs2.add(0,"("+""+")");
	//	System.out.println(hs2);
		return hs2;
		
	}

		public static void main(String[] args) throws NumberFormatException, IOException {
				// TODO Auto-generated method stub
			/*int arr[] = {1,2,2};
			int n=arr.length;
			subset(arr,n);*/
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
			int t = Integer.parseInt(br.readLine());
			List<LinkedList<String>> ans = new LinkedList<LinkedList<String>>();
			for(int i=0;i<t;i++)
			{
				int n = Integer.parseInt(br.readLine());
				String s = br.readLine();
				String sarr[]=s.split(" ");
				ans.add(subset(sarr,n));

			}
			for(LinkedList<String> l: ans)
			{
				for(String s: l)
				{
					System.out.print(s);
				}
				System.out.println();
			}
			}catch(NumberFormatException nse)
			{
				System.out.println("check input");
			}catch(ArrayIndexOutOfBoundsException ase)
			{
				System.out.println("check array input");
			}
			}

}