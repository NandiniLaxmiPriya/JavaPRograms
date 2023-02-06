package practice82;
 class Person{
	public void talk()
	{
		System.out.println("I am person");
	}
}
class Student extends Person{
	public void talk()
	{
		System.out.println("I am student");
	}
}
public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Student();
		p.talk();
	}

}
