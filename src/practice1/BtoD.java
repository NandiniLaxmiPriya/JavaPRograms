package practice1;

import java.util.Scanner;

public class BtoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int i=0;
		int sum =0;
		while(n>0)
		{
			int r = n%10;
			sum = (int) (sum + Math.pow(2, i)*r);
			i=i+1;
			n=n/10;
		}
		System.out.println(sum);

	}

}
