package practice4;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class Copyy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = {"red","yellow","blue"};
		List<String> lls = Arrays.asList(s);
		
		String cs[] = new String[3];
		List<String> lls2 = Arrays.asList(cs);
		Collections.copy(lls2,lls);
		System.out.println(lls2);
	}

}
