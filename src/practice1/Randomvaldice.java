package practice1;
import java.util.Random;
public class Randomvaldice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		r.setSeed(6);
		for(int i=1;i<=20;i++)
		{
			int f = 1 + r.nextInt(6);
			System.out.print(f);
			if(i%5==0)
			{
				System.out.println();
			}
			else {
				System.out.print("\t");
			}
		}
	}

}
