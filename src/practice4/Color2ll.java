package practice4;
import java.util.Collections;
import java.util.*;
public class Color2ll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = {"red","blue","yellow","black","purple","orange"};
		List<String> ll = new LinkedList<>();
		List<String> ll2 = new LinkedList<>();
		for(int i=0;i<s.length;i++)
		{
			
			if(i%2!=0)
			{
				ll2.add(s[i]);
			}
			else {
				ll.add(s[i]);
			}
		}
	/*	//System.out.println(ll);
		ll.addAll(ll2);
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("----reverse----");
		
		while(lis.hasPrevious())
		{
			System.out.println(lis.previous());
		}
		ll.subList(3,5).clear();
		System.out.println(ll);
		*/
		ListIterator lis = ll.listIterator();
		while(lis.hasNext())
		{
			String ss = (String) lis.next();
			lis.set(ss.toUpperCase());
			
		}
		for(String i : ll)
		{
			System.out.println(i);
		}
	}

}
