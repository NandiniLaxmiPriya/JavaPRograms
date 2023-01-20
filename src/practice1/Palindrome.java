package practice1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 digit num");
		int n = sc.nextInt();
		int sum = 0;
		int pn=n;
		boolean t=true;
		while(t)
		{
			n=pn;
			if(String.valueOf(pn).length()==5)
			{
		while(n>0)
		{
			int r = n%10;
			sum = (sum*10) +r;
			n=n/10;
		}

		if(sum==pn)
		{
			System.out.println("Palindrome");
			t=false;
		}
		else {
			System.out.println("Not palindrome");
			t=false;
		}
		}
			else {
				System.out.println("Not a 5 digit : Enter 5 digit value ");
				 pn = sc.nextInt();
			}
		}
	}

}
