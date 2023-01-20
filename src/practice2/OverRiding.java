package practice2;
class Animals
{
	public void sound() {
		System.out.println("I can make sound");
	}
}
class Lions extends Animals
{
	public void sound() {
		System.out.println("Roar Roar");
	}
}
class Pigs extends Animals
{
	public void sound() {
		System.out.println("Wee Wee");
	}
}
class noanimal extends Animals
{
	
}
public class OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animals aa = new Animals();
		aa.sound();
		Lions ll = new Lions();
		ll.sound();
		Pigs pp = new Pigs();
		pp.sound();
		Animals aa2 = new noanimal();
		aa2.sound();
	}

}
