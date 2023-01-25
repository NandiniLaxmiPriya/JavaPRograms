package practice4;

public class GenericsPrac {
	public static <T> void print(T name)
	{
		System.out.println("The value is "+name);
	}
	public static <T,V> void print(T name, V name2)
	{
		System.out.println("The values are "+name+" "+name2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("Red");
		print(10,"Green");
	}

}
