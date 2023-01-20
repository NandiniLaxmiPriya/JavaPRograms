package practice1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s =String.valueOf(n);
		try
		{
			if(s.length()==5)
			{
				for(int i=0;i<s.length();i++)
				{
					System.out.printf("%-3s",s.charAt(i));
					
				}
			}else
			{
				System.out.println("Not a Five digit Integer");
			}
			
		}
		finally{
			sc.close();
		}

	}

}
