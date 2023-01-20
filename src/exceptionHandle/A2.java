package exceptionHandle;
import java.io.*;
public class A2 {

	public static void show() throws IOException {
		show2();
	}
	public static void show2() throws IOException{
		try {
			throw new IOException("checked exception");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		show();
	}

}
/*Difference between checked and unchecked exception is
 * In line 5 by not declaring throws IOException it shows error
 * 
 */