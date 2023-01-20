package practice1;

import java.util.Scanner;

public class Spherevol {

	public static double vol(double radius)
	{
		return (4/3)*Math.PI*Math.pow(radius, 3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		System.out.println("The volume of sphere of "+radius+"is "+vol(radius));

	}

}
