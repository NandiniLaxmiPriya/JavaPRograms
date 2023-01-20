package exceptionHandle;
import java.io.*;
public class A1 {

	public static void show() {
		try {
			throw new IOException("checked exception");
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
