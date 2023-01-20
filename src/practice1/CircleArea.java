package practice1;
import java.util.Scanner;
public class CircleArea {
	public static double area(int radius)
	{
		double ans = Math.PI*(Math.pow(radius, 2));
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int radius = sc.nextInt();
		System.out.printf("%S %d %S %5.2f","The area of circle for radius",radius,"is",area(radius));
		
	}

}
