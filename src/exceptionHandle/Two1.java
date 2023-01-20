package exceptionHandle;
import java.io.*;
public class Two1 {

	public static void show() {
		try {
			throw new ArithmeticException("Unchecked exception");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		show();
	}

}
