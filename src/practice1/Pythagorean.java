package practice1;

import java.util.Scanner;

public class Pythagorean {

	public static void check(int a,int b,int c)
	{
		if((a*a+b*b==c*c)|| (a*a+c*c==b*b) || (b*b +c*c==a*a))
		{
			System.out.println(a+" "+b+" "+c);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 0;
		int c = 0;
		int m = 2;
		System.out.printf("%s %s %s\n","Side1","Side2","Hypotenuse");
		while(c<500)
		{
			for(int n=1;n<m;n++)
			{
				 a =m*m -n*n;
				 b=2*m*n;
				 c=m*m+n*n;
				 if(c>500)
				 {
					 break;
				 }
				 System.out.printf("%-5d %-5d %-5d\n",a,b,c);
			}
			m++;
		}
		
		/*if((a+b<=c)||(a+c<=b)||(b+c<=a))
		{
			System.out.println("Yes triangle");
		}
		else
		{
			System.out.println("No triangle");
		}*/
	}

}
