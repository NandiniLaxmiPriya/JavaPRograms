package practice2;
import java.util.Arrays;
public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {6,4,2,9,6,0};
		Arrays.sort(a);
		for(int i:a)
		{
			System.out.println(i);
		}
		
		int b[]=new int[5];
		Arrays.fill(b, 4);
		//displayArray(b,"Filled arrays");
		for(int i:b)
		{
			System.out.println(i);
		}
		int c[] = new int[a.length];
		System.arraycopy(a, 0, c, 0, a.length);
		for(int i:c )
		{
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println(Arrays.binarySearch(a,6));
		System.out.println(Arrays.equals(a,b));
		}
}
