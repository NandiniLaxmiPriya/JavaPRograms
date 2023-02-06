package practice82;

class Super
{
	public int i=0;
	Super(String text)
	{
		i=1;
	}
}
public class P1 extends Super{

	P1(String text)
	{
		super(text);
		i=2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1 p = new P1("hello");
		System.out.println(p.i);
	}

}
