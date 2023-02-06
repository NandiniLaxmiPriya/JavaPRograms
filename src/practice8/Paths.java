package practice8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Paths {

	public static int count(int m,int n)
	{
		if(m==1||n==1)
		{
			return 1;
		}
		
		return count(m,n-1)+count(m-1,n);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader	br = new BufferedReader(new InputStreamReader(System.in));
		try {
		int t = Integer.parseInt(br.readLine());
		int ans[] = new int[t];
		for(int i=0;i<t;i++)
		{
			int arr[] = new int[2];
			String s = br.readLine();
			String s1[]=s.split(" ");
			arr[0]=Integer.parseInt(s1[0]);
			arr[1]=Integer.parseInt(s1[1]);
			ans[i]=count(arr[0],arr[1]);
		}
		System.out.println("output");
		for(int i=0;i<t;i++)
		{
			System.out.println(ans[i]);
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
