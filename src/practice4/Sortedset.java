package practice4;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Integer> sos = new TreeSet<>();
		sos.add(12);
		sos.add(10);
		sos.add(13);
		sos.add(17);
		System.out.println(sos);
		System.out.println(sos.first());
		System.out.println(sos.last());
		System.out.println(sos.headSet(13));
		System.out.println(sos.tailSet(13));
		System.out.println(sos.remove(12));
		System.out.println(sos);
	}

}
