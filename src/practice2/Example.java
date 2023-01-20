package practice2;
class AA
{
	public void sayHello()
	{
		System.out.println("A says hello");
	}
}
class BB extends AA
{
	public void sayHello()
	{
		System.out.println("B says hello");
	}
}
class C
{
	private static int apples=0;
	private int mangoes = 0;
	private String name;
	public C(String n)
	{
		name = n;
	}
	public void addApples(int newApples)
	{
		apples+=newApples;
	}
	public void addMangoes(int newMangoes)
	{
		mangoes+=newMangoes;
	}
	public void printApples()
	{
		System.out.println(apples+" "+"apples"+name);
	}
	public void printMangoes()
	{
		System.out.println(mangoes+" "+"Mangoes"+name);
	}
	public static void processMangoes(C c1)
	{
		c1 = new C("pc");
		c1.addMangoes(15);
		c1.printMangoes();
	}
	
}
public class Example {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a = new AA();
		BB b = new BB();
		a.sayHello();
		b.sayHello();
		
		//a=b;
		///a.sayHello();
		//b=(BB)a;
		a = new BB();
		C c1 = new C("c1");
		C c2 = new C("c2");
		/*c1.addApples(5);
		c2.addApples(10);
		c1.addMangoes(15);
		c2.addMangoes(20);
		
		c1.printApples();
		c1.printMangoes();
		c2.printApples();
		c2.printMangoes();
		*/
		C c = new C("ec");
		c.addMangoes(5);
		c.processMangoes(c);
		c.printMangoes();
		
	}

}
