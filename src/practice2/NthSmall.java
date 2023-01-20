package practice2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
public class NthSmall {
	public void getNsmall(int a[],int k)
	{
		HashMap<Integer,Integer> hm = new HashMap<>();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i]))
			{
				int x = hm.get(a[i]);
				x=x+1;
				hm.put(a[i],x);
			}
			else {
				hm.put(a[i], 1);
			}
		}
		System.out.println(hm.keySet());
		ArrayList<Integer> ar = new ArrayList<>(hm.keySet());
		Collections.sort(ar);
		for(int i :ar)
		{
			count+=1;
			
			if(count==k)
			{
				System.out.println(i+" "+hm.get(i));
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {7,2,6,3,1,2,4};
		int k = 3;
		NthSmall nm = new NthSmall();
		nm.getNsmall(a, k);
		}

}
