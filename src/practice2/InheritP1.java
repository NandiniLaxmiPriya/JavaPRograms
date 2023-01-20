package practice2;

class Fruits
{
	String s = "Fruit";
}
class Apple extends Fruits
{
	void display()
	{
		System.out.print("I am Apple ");
		System.out.print(super.s);
	}
}
public class InheritP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple app = new Apple();
		app.display();
	}

}
