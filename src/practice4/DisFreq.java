package practice4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
		m.forEach((a) -> System.out.println(a));
		System.out.println("------------------");
		m.stream().filter(e->e.equals(33)).forEach((n)->System.out.println(n));
		System.out.println("------------------");
		m.stream().map(i->i*2).collect(Collectors.toList()).forEach((n)->System.out.println(n));
		System.out.println("------------------");
		
		m.stream().limit(3).forEach((n)->System.out.println(n));
		System.out.println("------------------");
		m.stream().limit(4).sorted().forEach((n)->System.out.println(n));
	}

}
