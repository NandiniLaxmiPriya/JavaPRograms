package practice2;

public class Time1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time1 t = new Time1();
		try {
		t.setTime(9,42, 30);
		System.out.println(t.toString());
		System.out.println(t.toUniversalString());
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
