package exceptionHandle;
class Top
{
	public void display() throws ArithmeticException
	{
		System.out.println("I'm in Top class");
	}
}
class Bottom extends Top
{
	/*public void display() throws Exception //cannot declare parent exception
	{										 // ie parent of ArithmeticException is Exception
		System.out.println();
	}*/
	public void display() throws ArithmeticException
	{
		System.out.println("Bottom class"); //can throw same exception or no exception
	}
}
public class Rule2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Top tp = new Bottom();
		try {
			tp.display();
		}catch(Exception e)
		{
			
		}

	}

}
