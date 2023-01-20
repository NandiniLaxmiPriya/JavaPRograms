package practice1;

public class Overload {

	public static int add(int a,int b)
	{
		System.out.println("In int");
		return a+b;
	}
	public static double add(double a,double b)
	{
		System.out.println("In Double");
		return a+b;
	}
	public static float add(float a,float b)
	{
		System.out.println("in float");
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(add(1,2));
		System.out.println(add(1.3f,2.6f));
		System.out.println(add(2.56789054,2.8763446586345));
	}

}
