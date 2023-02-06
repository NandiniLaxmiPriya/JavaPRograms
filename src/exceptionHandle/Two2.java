package exceptionHandle;
import java.io.*;
public class Two2 {

	public  void show() {
		show2();
	}
	public static void show2() throws ArithmeticException {
		try {
			throw new ArithmeticException("unchecked exception");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two2 tt = new Two2();
				tt.show();
	}

}
