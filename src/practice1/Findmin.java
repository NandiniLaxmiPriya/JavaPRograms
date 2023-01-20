package practice1;
import java.util.Scanner;
public class Findmin {

	public static float floatMin(float f1,float f2,float f3)
	{
		
		return Math.min(f1, Math.min(f2, f3));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		float f1 = sc.nextFloat();
		float f2 = sc.nextFloat();
		float f3 = sc.nextFloat();
		System.out.printf("%-2.2f %-2s",floatMin(f1,f2,f3),"is the minimum value");
	}

}
