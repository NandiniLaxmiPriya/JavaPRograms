package practice4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DisFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> m = new ArrayList<>();
		m.add(33);
		m.add(30);
		m.add(33);
		m.add(330);
		m.add(336);
		m.add(335);
		List<Integer> m2 = new ArrayList<>();
		m2.add(331);
		m2.add(3301);
		m2.add(3312);
		
		
		int f = Collections.frequency(m, 330);
		System.out.println(f);
		boolean b =Collections.disjoint(m, m2);
		System.out.println(b);
	}

}
