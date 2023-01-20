package practice2;
class A
{
	A()
	{
		System.out.println("I am in class A");
	}
}
class B extends A
{
	B()
	{
		super();
		System.out.println("I am in class B");
	}
}
public class Inherit3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
	}

}
