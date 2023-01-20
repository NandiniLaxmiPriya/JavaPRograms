package practice1;
import java.util.Random;
public class Randomsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rm = new Random();
		rm.setSeed(5);
		for(int i=0;i<5;i++)
		{
			int f =2+2*rm.nextInt(5);
			System.out.println(f);
		}
System.out.println();
		for(int i=0;i<5;i++)
		{
			int f =3+2*rm.nextInt(5);
			System.out.println(f);
		}
		
		System.out.println();
		
		for(int i=0;i<5;i++)
		{
			int f =6+4*rm.nextInt(5);
			System.out.println(f);
		}
	}

}
