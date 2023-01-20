package javaio;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class WriteStudentRecord {
	
	Formatter output1 ;
	
	public void openTextFile()
	{
		try
		{
			output1 = new Formatter("student.txt");
		}catch(FileNotFoundException fnfe)
		{
			System.err.print("Error creating or opening file");
			System.exit(1);
		}catch(SecurityException e)
		{
			System.err.print("error writing into file");
		}
	}
	
	public void readIntoStudent()
	{
		Scanner sc = new Scanner(System.in);
		int rollno;
		String name;
		int age;
		StudentRecord stu ;
		System.out.printf("%s","Enter rollno name age\n");
		while(sc.hasNext())
		{
			try {
		
			rollno = sc.nextInt();
			name = sc.next();
			age=sc.nextInt();
			stu = new StudentRecord(rollno,name,age);
			output1.format("%d %s %d\n",stu.getRollno(),stu.getStudentName(),stu.getAge());
			}catch(FormatterClosedException fce)
			{
				System.err.print("Error writing to file");
				System.exit(1);
			}
			catch(NoSuchElementException nse)
			{
				System.err.print("Invalid input");
				sc.nextLine();
			}
			System.out.printf("%s","Enter rollno name age\n");
		}
	}
	
	public void closeTextFile()
	{
		if(output1!=null)
		{
			output1.close();
		}
	}
}
