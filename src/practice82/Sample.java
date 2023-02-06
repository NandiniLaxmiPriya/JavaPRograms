package practice82;
abstract class dimple{
	int i;
	abstract void display();
}
public class Sample  extends dimple{
	int j;
	public void display()
	{
		System.out.print(j+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample sr = new Sample();
		sr.j=2;
		sr.display();
		dimple dr = new Sample();
		dr.i=2;
		dr.display();
	}

}
