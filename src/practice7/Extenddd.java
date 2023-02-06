package practice7;
class Fish
{
	private int age;
	Fish()
	{
		
	}
	Fish(int age)
	{
		this.age=9;
	}
}
public class Extenddd extends Fish{
	
	Extenddd()
	{
	}
	public static String hehe()
	{
		System.out.println("polo");
		return "poloo";
	}
	public void yoo()
	{
		System.out.println("hey"+hehe());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
