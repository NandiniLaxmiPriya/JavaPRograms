package practice2;

class Flower
{
	void color()
	{
		System.out.println("Depends on the type of flower");
	}
}
class Rose extends Flower
{
	void color()
	{
		System.out.println("Red");
	}
	void count()
	{
		System.out.println(2+" Red roses");
	}
	void display()
	{
		super.color();
		count();
	}
}
public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rose r = new Rose();
		r.display();
	}

}
