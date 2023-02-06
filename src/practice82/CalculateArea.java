package practice82;

public class CalculateArea {
	void area(int a)
	{
		System.out.print(a*2+" ");
	}
	void area(int a,int b)
	{
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateArea cr = new CalculateArea();
		cr.area(10);
		cr.area(20,20);
	}

}
