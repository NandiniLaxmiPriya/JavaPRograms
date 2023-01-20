package practice2;

import java.util.Scanner;

public class Overloading {
	public int Area(int a,int b)
	{
		//System.out.println("int");
		return a*b;
	}
	public  double Area(double a,double b)
	{
		//System.out.println("double");
		return a*b;
	}
	public float Area(float a,float b)
	{
		//System.out.println("float");
		return a*b;
	}
	public int Area(int a)
	{
		return a*a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o = new Overloading();
		Scanner sc = new Scanner(System.in);
		System.out.println("The area of rectangle with length and breadth in float "+o.Area(sc.nextFloat(),sc.nextFloat()));
		System.out.println("The area of rectangle with length and breadth in float "+o.Area(2f, 4f));
		System.out.println("The area of rectangle with length and breadth in double "+o.Area(2.98d, 4.76d));
		System.out.println("The area of rectangle with length and breadth in int "+o.Area(3,3));
		System.out.println("The area of square with side in int "+o.Area(6));
				
	}

}
