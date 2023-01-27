package practice3;
import java.util.ArrayList;
public class LucidNumberGeneration {

	public static void generate(int n)
	{
		ArrayList<Integer> ar = new ArrayList<>();
		for(int i=1;i<=n;i++)
		{
			ar.add(i);
		}
		int first=0;
		for(int i=1;i<ar.size();i++)
		{
			first=ar.get(i);
			int rem = first+i;
			while(rem<ar.size())
			{
				ar.remove(rem);
				rem=rem+first-1;
			}
		}
		System.out.println(ar);
	}
	public static void main(String args[])
	{
		int n=20;
		generate(n);
	}
}
