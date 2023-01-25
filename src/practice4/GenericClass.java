package practice4;

public class GenericClass <T extends Comparable>{
 
			T n1;
			T n2;
			public GenericClass(T n1,T n2)
			{
				this.n1 = n1;
				this.n2 = n2;
			}
	public  void print()
	{
		if(n1.compareTo(n2) >0)
		{
		System.out.println("Greater"+n1);
		}
		else {
			System.out.println("Greater"+n2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<Integer> ol = new GenericClass<>(13,14);
	//	GenericClass<Integer> oll = new GenericClass<>(14);
		ol.print();
	}

}
