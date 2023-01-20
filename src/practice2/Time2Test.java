package practice2;

public class Time2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Time2 t = new Time2();
		try {
		Time2 t = new Time2();
		System.out.println(t.toString());
		System.out.println(t.toUniversalString());
		Time2 t2 = new Time2(12,6,10);
		System.out.println(t2.toString());
		System.out.println(t2.toUniversalString());
		Time2 t3 = new Time2(23,54);
		System.out.println(t3.toString());
		System.out.println(t3.toUniversalString());
		Time2 t4 = new Time2(t3);
		System.out.println(t4.toString());
		System.out.println(t4.toUniversalString());
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
