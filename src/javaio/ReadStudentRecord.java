package javaio;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ReadStudentRecord {
	Scanner input1 ;
	public void opentextFile()
	{
		try {
			input1 = new Scanner(new File("student.txt"));
		}catch(FileNotFoundException fne)
		{
			System.err.print("error opening file");
			System.exit(1);
		}
	}
	
	public void readStuRecords()
	{
		StudentRecord sturec = new StudentRecord();
		try {
			System.out.printf("%5s %5s %5s\n","RollNo","Name","Age");
			while(input1.hasNext())
			{
				sturec.setRollno(input1.nextInt());
				sturec.setStudentName(input1.next());
				sturec.setAge(input1.nextInt());
				System.out.printf("%5d %5s %5d\n",sturec.getRollno(),sturec.getStudentName(),sturec.getAge());
			}
		}catch(IllegalStateException ise)
		{
			System.err.print("error writing from file");
			System.exit(1);
		}catch(NoSuchElementException nse)
		{
			System.err.print("input invalid");	
		}
	}
	
	public void closetextFile()
	{
		if(input1!=null)
		{
			input1.close();
		}
	}
}
