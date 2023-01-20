package exceptionHandle;

public class ChainedException {

	public static void method1() throws Exception
	{
		try {
		method2();
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			throw new Exception("Exception in m1",e);
		}
		
	}
	public static void method2() throws Exception
	{
		try {
			method3();
			}
			catch(Exception e)
			{
				//e.printStackTrace();
				throw new Exception("Exception in m2",e);
			}
	}
	public static void method3() throws Exception
	{
		throw new Exception("Exception in m3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
