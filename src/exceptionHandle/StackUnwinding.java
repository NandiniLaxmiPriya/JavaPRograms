package exceptionHandle;

public class StackUnwinding {
	public static void method1() throws Exception
	{
		method2();
	}
	public static void method2() throws Exception
	{
		method3();
	}
	public static void method3()throws Exception
	{
		throw new Exception("helo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
			StackTraceElement[] tre = e.getStackTrace();
			System.out.printf("class \t\t\t\t File \t\t\t Line \t Method\n");
			for(StackTraceElement ele : tre)
			{
				System.out.printf("%s\t",ele.getClassName());
				System.out.printf("%s\t",ele.getFileName());
				System.out.printf("%s\t",ele.getLineNumber());
				System.out.printf("%s\n",ele.getMethodName());
			}
		}

	}

}
