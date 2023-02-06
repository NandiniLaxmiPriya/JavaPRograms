package practice82;

public class Overload {

	public static void sum(int a,double b)
	{
		System.out.println(a+b);
	}
	public static void sum(double a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(1,2.3);
		sum(2.4,0);
	}

}
