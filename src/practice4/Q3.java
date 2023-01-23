package practice4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Q3 {

	public static void listConcatenate(List<Character> l1, List<Character> l2)
	{
		l1.addAll(l2);
		System.out.println("Lists after concatenation is");
		System.out.println(l1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Character c1[]= {'a','h','u'};
	//	Character c2[]= {'p','k','g'};
		List<Character> l1 = new LinkedList<>();
		List<Character> l2 = new LinkedList<>();
		l1.add('a');
		l1.add('h');
		l1.add('u');
		
		l2.add('t');
		l2.add('i');
		l2.add('k');
		listConcatenate(l1,l2);
		
	}

}
