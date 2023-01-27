package practice3;
interface animal{
	final static  int a=9;
	public void print();
}
public class Interfacexample implements animal{

	//final static int a =10;
	public void print()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal aa = new Interfacexample();
		aa.print();
	}

}
