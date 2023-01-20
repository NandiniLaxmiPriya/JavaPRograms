package practice1;

import java.util.Scanner;

public class Checkintegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 =sc.nextInt();
		int n2 =sc.nextInt();
		if(n1>n2)
		{
			System.out.println(n1+" is larger");
		}
		else if(n2>n1)
		{
			System.out.println(n2+" is larger");
		}
		else if(n1==n2)
		{
			System.out.println("These numbers are equal");
		}

	}

}
