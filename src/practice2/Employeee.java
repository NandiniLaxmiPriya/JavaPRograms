package practice2;

public class Employeee {

	String empName;
	int empAge;
	String dob;
	String hireDate;
	public Employeee(String name,int age,String dob,String hireDate)
	{
		this.empName = name;
		this.empAge = age;
		this.dob = dob;
		this.hireDate = hireDate;
	}
	public String toString()
	{
		return String.format("%s %d %s %s",empName,empAge,dob,hireDate);
	}
}
