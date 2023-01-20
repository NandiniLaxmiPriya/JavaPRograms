package practice1;

import java.util.Scanner;

public class Conste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		//formula e^x=1+x/1! +x^2/2! -----
		int n = sc.nextInt();
		int fact[] = new int[n+1];
		fact[1]=1;
		for(int i=2;i<=n;i++)
		{
			fact[i] = i*fact[i-1];
		}
		int sum=1;
		for(int i=1;i<=n;i++)
		{
			//System.out.println(fact[i]);
			int temp = (int) Math.pow(x, i);
			temp = temp/fact[i];
			sum=sum+temp;
		}
		System.out.println(sum);
	}

}
