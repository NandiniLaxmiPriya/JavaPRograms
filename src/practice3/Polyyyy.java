package practice3;
class Animals
{
	int a =10;
	public void print()
	{
		System.out.println(a+"animals");
	}
}

public class Polyyyy extends Animals {
int a=9;
	public void print()
	{
		System.out.println(a+"polyy");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals aaa  = new Animals();
		Animals ab = new Polyyyy();
		Polyyyy p = new Polyyyy();
		aaa.print();
		ab.print();
		System.out.println(aaa.a+"animals");
		System.out.println(p.a+"polyy");
		System.out.println("antopo"+ab.a);
	}

}
