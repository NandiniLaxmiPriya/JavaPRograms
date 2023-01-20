package exceptionHandle;

public class FullyQualified {

	public static void throwException() throws Exception
	{
		try
		{
				System.out.println("In try of throw exception");
				throw new Exception();
		}catch(Exception e)
		{
			System.out.println("In throw exception");
			System.err.print("In throw exception "+e);
			throw e;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("In main method");
			throwException();
		}
		catch(Exception e)
		{
			System.out.println("In main method");
			System.err.print(e.toString());
		}

	}

}
