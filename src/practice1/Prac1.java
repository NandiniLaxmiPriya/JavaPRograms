package practice1;

import java.util.Scanner;

public class Prac1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int c = 1;
		int n;
		int large1=0;
		int large2=0;
		while(c<=10)
		{
			
			n = sc.nextInt();
			if(n>large1)
			{
			
			if(c==10)
			{
				large2=large1;
				large1=n;
			}
			else {
				large1=n;
			}
			}
			c=c+1;
		}
		System.out.println("1st large"+large1 +" ------ 2nd large"+large2);
	}

}
