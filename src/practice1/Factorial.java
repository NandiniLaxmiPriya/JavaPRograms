package practice1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);

			//long n =sc.nextLong();
			
			
			long fact=1;
			for(long i=1;i<=20;i++)
			{
				fact=1;
			for(long j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			
			System.out.println(i+" "+fact);
			}
	
}
}
