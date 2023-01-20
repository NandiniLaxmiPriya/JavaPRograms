package practice1;

public class Scopeofprivatevars {

	private static int x=1;//field that is accessible to all methods
	
	public static void useLocalVar()
	{
		int x =25;
		System.out.printf("Value in localvar %d\n",x);
		x=x+20;
		System.out.printf("Value in localvar %d\n",x);
	}
	public static void useField()
	{
		System.out.printf("Value in field val %d\n",x);
		x=x*10;
		System.out.printf("Value in field val %d\n",x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		System.out.printf("Value in main %d\n",x);
	
		useLocalVar();
		useField();
		
		x=x+5;
		System.out.printf("Value in main %d\n",x);
		
		useField();
		
		System.out.printf("Value in main %d\n",x);

	}

}
