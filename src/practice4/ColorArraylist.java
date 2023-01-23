package practice4;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
public class ColorArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = {"red","blue","yellow","black","purple","orange"};
		
		List<String> l1 = new ArrayList<>();
		List<String> l2 = new ArrayList<>();
		for(int i=0;i<s.length;i++)
		{
			
			if(i%2==0)
			{
				l2.add(s[i]);
			}
			else {
				l1.add(s[i]);
			}
		}
		//System.out.println(l2);
		Iterator<String> iterator = l1.iterator();
		while(iterator.hasNext())
		{
		//	System.out.println(iterator.next());
			
			if(l2.contains(iterator.next())) {
				iterator.remove();
			}
		}
		System.out.println(l1);
	}

}
