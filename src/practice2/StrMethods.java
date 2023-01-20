package practice2;

public class StrMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="TODO Auto-generated method stub";
		System.out.println(s.substring(8,15));
		System.out.println(s.startsWith("T"));
		System.out.println(s.endsWith("B"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		String m = s.intern();
		System.out.println(m);
		System.out.println(s.replace("Auto", "Car"));
	}

}
