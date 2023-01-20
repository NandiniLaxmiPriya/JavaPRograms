package practice1;

import java.util.Scanner;

public class LargeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String str = "9,223,372,036,854,775,807";
		String str2 = "2432902008176640000";
		System.out.println(str.length());
		System.out.println(str2.length());*/
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		if(a>b)
		{
			System.out.println(a+" is larger");
		}
		else if(b>a)
		{
			System.out.println(b+" is larger");
		}
		else if(a==b)
		{
			System.out.println("These numbers are equal");
		}
	}

}
