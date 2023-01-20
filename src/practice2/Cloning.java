package practice2;
class App implements Cloneable
{
	int i,j;

	@Override
	public String toString() {
		return "App [i=" + i + ", j=" + j + "]";
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class Cloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		App app1 = new App();
		app1.i=6;
		app1.j=7;
		App app2 = (App)app1.clone();
		app2.i=8;
		System.out.println(app1);
		System.out.println(app2);
	}

}
