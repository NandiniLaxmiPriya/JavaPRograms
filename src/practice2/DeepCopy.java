package practice2;
class Abc
{
	int i,j;

	@Override
	public String toString() {
		return "Abc [i=" + i + ", j=" + j + "]";
	}
	
}
public class DeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc a1 = new Abc();
		a1.i=4;
		a1.j=7;
	//	System.out.println(a1);
		Abc a2 = new Abc();
		a2.i=a1.i;
		a2.j=a1.j;
		//System.out.println(a2);
		a2.i=5;
		System.out.println(a2);
		System.out.println(a1);
	}

}
