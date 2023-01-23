package practice4;
import java.util.Arrays;
import java.util.LinkedList;
public class AsLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] hs = {"red","blue","lavender"};
		LinkedList<String> hmm= new LinkedList<>(Arrays.asList(hs));
		
		hmm.addFirst("first");
		hmm.addLast("last");
		hmm.add(3,"middle");
		
		System.out.println(hmm);
		hs = hmm.toArray(new String[hmm.size()]);
		
		for(int i=0;i<hs.length;i++)
		{
			System.out.println(hs[i]);
		}

	}

}
