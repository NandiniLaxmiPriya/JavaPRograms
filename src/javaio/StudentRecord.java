package javaio;

public class StudentRecord {
	private int rollno;
	private String studentName;
	private int age;
	
	public StudentRecord()
	{
		this(0,"",0);
	}

	public StudentRecord(int i, String stu, int j) {
		setRollno(i);
		setStudentName(stu);
		setAge(j);
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
