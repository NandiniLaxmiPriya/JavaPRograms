package practice3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TypesOfInstantiation {
	public void haha()
	{
		System.out.println("Hahah");
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		/*TypesOfInstantiation ts = TypesOfInstantiation.class.newInstance();
		ts.haha();
		
Constructor<TypesOfInstantiation> obj = TypesOfInstantiation.class.getConstructor();
TypesOfInstantiation obj1= obj.newInstance();
obj1.haha();*/
		
		//TypesOfInstantiation ttt = new TypesOfInstantiation();
		String s ="abcd efg ab cd";
	//	s=s.intern();
		/*System.out.println(s.equals("abcdefg"));
		System.out.println(s==new String("abcdefg"));
		System.out.println(s.indexOf('c')+"first occurance");
		System.out.println(s.lastIndexOf('c')+"last occurance");
		char c[] = new char[13];
		s.getChars(1, 14, c, 0);
		for(char i: c)
		{
			System.out.println(i);
		}
		StringBuffer sbf = new StringBuffer("Hello");
		System.out.println(sbf.reverse());
		System.out.println(sbf);
		Integer h[]= {1,2,3,4,5};
		ArrayList<Integer> al = new ArrayList<>();
		List<Integer> al2 = Arrays.asList(h);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		Object[] abs=al.toArray();
		
		for(int i=0;i<abs.length;i++)
		{
			System.out.println(abs[i]);	
		}
		System.out.println(al2);*/
		s=s.concat("va");
		System.out.println();
		System.out.println(s);
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(0,al.indexOf(1));
		al.set(al.indexOf(1), 2);
		System.out.println(al);
		int a[] = {1,2,3};
		int b[] = {1,2,3};
		System.out.println(a==b);
		
	}

}
