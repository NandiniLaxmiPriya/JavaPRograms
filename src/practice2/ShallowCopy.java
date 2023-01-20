package practice2;
class Def
{
	int i;
	int j;
	public String toString()
	{
		return String.format("%d %d",i,j);
	}
}
public class ShallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Def f1 = new Def();
		f1.i=4;
		f1.j=7;
		//System.out.println(f1);
		Def f2 = f1;
		//System.out.println(f2);
		f2.i=5;
		System.out.println(f2);
		System.out.println(f1);
	}

}
