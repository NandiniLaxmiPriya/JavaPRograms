package practice2;

import java.util.ArrayList;

public class Aralist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Hello");
		ar.add("Hi");
		ar.add("hmm");
		ar.add("done");
		System.out.println(ar);
		System.out.println(ar.get(0));
		System.out.println(ar.remove(0));
		System.out.println(ar);
		System.out.println(ar.size());
		if(ar.contains("hmm"))
		{
			System.out.println("True");
		}
	}

}
