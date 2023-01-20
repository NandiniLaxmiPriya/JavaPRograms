package practice2;

public class Sample {

	static int s=0;
	public static void print()
	{
		System.out.println(s);
		show();
	}
	public static void show()
	{
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample s = new Sample();
		Sample s2 = new Sample();
		System.out.println(s.getClass());
		System.out.println(s.hashCode());
		System.out.println(s.equals(s2));
		System.out.println(s.toString());
		System.out.println(s instanceof Sample);
	}

}
