package exceptionHandle;
class Parent
{
	public void show()
	{
		System.out.println("I am in parent class");
	}
}
class Child extends Parent {
	/*public void show() throws IOException
	{
		System.out.println("I am in child class"); // subclass overridden method cannot declare CHecked Exception,
													//but can throw unchecked exception
	}*/
	public void show() throws ArithmeticException
	{
		System.out.println("I am in child class");
	}
}
public class Rule1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1 = new Child();
		p1.show();
	}

}
