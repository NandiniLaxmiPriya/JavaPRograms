package practice3;
class A
{
	protected char c='a';
	void show()
	{
		System.out.println(c);
	}
}
class B extends A
{
	protected char c='b';
	void show()
	{
		System.out.println(c);
	}
	void sshow()
	{
		System.out.println(super.c);
	}
}
public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		B b = new B();
		System.out.println(a.c);
		a.show();
		b.show();
		b.sshow();
	}

}
