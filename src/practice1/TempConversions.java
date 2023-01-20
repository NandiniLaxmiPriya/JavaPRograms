package practice1;
import java.util.Scanner;
public class TempConversions {
	
	public static float ctof(int ct)
	{
		float fahrenheit = ((9/5)*ct)+32;
		return fahrenheit; 
	}
	
	public static float ftoc(int ft)
	{
		
		float celsius =(ft-32);
		celsius = celsius*5/9;
		System.out.println(celsius);
		return celsius; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temp in celsius");
		int ct = sc.nextInt();
		System.out.println("Enter temp in Fahrenheit");
		int ft = sc.nextInt();
		System.out.printf("%s %.2f\n","Celsius to Fahrenheit",ctof(ct));
		System.out.printf("%s %.2f\n","Fahrenheit to Celsius",ftoc(ft));
	}

}
