package practice4;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Sortll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {4,2,54,66666,3443,0};
		List<Integer> num = new ArrayList<>();
		for(int i=0;i<n.length;i++)
		{
			num.add(n[i]);
		}
		System.out.println(num);
		Collections.sort(num);
		System.out.println(num);
		Collections.sort(num,Collections.reverseOrder());
		System.out.println(num);
		Collections.shuffle(num);
		System.out.println(num);
		Collections.reverse(num);
		System.out.println(num);
		//Collections.fill(num,9);
		System.out.println(num);
		int r = Collections.binarySearch(num,9);
		System.out.println(r);
	}

}
