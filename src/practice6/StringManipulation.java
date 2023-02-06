package practice6;

public class StringManipulation {
	void start()
	{
		String s1="slip";
		String s2=fix(s1);
		System.out.println(s1+" "+s2);
		
	}
	String fix(String s1)
	{
		s1 = s1+"stream";
		System.out.print(s1+" ");
		return "stream";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringManipulation sp = new  StringManipulation();
		 sp.start();
		 
	}

}
