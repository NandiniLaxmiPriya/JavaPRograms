package exceptionHandle;
import java.io.*;
public class Two3 {

	public static void show() {
		
	//throw new IOException("checked exception");
		throw new ArithmeticException("Unchecked exception");
		
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		show();
	}

}