package practice1;
import java.util.Scanner;
public class FloorExample {

	public static double roundoff(double x)
	{
		double ans = Math.floor(x*1000+0.5)/1000;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		System.out.println("original num "+x+" Round off is  "+roundoff(x));
		
	}

}
