package practice82;
class Numberr{
	public int no;
}
public class P13 {

	public void doIt(int i,Numberr n)
	{
		i=5;
		n.no=8;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		Numberr n = new Numberr();
		P13 p = new P13();
		p.doIt(x, n);
		System.out.println(x+" "+n.no);
	}

}
