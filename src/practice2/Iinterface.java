package practice2;
interface Animal{
	void says();
	void exists();
	
}
class Lion implements Animal
{
	public void says()
	{
		System.out.println("Roar");
	}
	public void exists()
	{
		System.out.println("Endangered");
	}
}
public class Iinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion ll = new Lion();
		ll.says();
		ll.exists();
	}

}
