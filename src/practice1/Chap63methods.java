package practice1;

public class Chap63methods {

	public static double hypotenuse(double side1,double side2)
	{
		//double ans = side1*side2;
		//ans = Math.round(ans*1000/1000.0);
		double ans = Math.pow(side1, 2)+Math.pow(side2, 2);
		ans=Math.sqrt(ans);
		return ans;
	}
	public static int smallest(int x,int y,int z)
	{
		return x*y*z;
	}
	public static void instructions()
	{
		System.out.println("hello");
	}
	public static float intToFloat(int x)
	{
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hypotenuse(4,3));
		System.out.println(smallest(1,2,3));
		instructions();
		System.out.println(intToFloat(3));
		

	}

}
