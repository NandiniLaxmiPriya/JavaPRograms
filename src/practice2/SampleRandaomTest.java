package practice2;
import java.util.Random;
public class SampleRandaomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		for(int i=0;i<10;i++)
		{
			int n = r.nextInt(10);
			System.out.println(n);
		}
		

	}

}
