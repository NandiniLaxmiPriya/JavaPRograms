package practice4;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1,"pink");
		hm.put(2,"green");
		hm.put(3, "black");
		for(Entry<Integer,String> s : hm.entrySet())
		{
			System.out.println(s);
		}
			
	}

}
