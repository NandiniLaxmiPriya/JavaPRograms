package practice1;

import java.util.Scanner;

public class Grades {

	private int ac=0;
	private int bc=0;
	private int cc=0;
	private int dc=0;
	private int fc=0;
	int grade;
	private int total =0;
	private double average;
	int gradec=0;
	private String coursename;
	
	public Grades(String coursename)
	{
		this.coursename = coursename;
	}
	public String getCoursename()
	{
		return coursename;
	}
	public void setCoursename(String coursename)
	{
		coursename=coursename;
	}
	public void displayMessage()
	{
		System.out.println("Enter grades between 0-100 for"+coursename);
		System.out.printf("%S","click ctrl +d to stop entering");
		
	}
	public void calgrade()
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			grade=sc.nextInt();
			total+=grade;
			gradec+=1;
		
		switch(grade/10)
		{
		case 9:
		case 10:
			++ac;
			break;
		case 8:
			++bc;
			break;
		case 7:
			++cc;
			break;
		case 6:
			++dc;
			break;
		default:
			++fc;
			break;
			
		}
		}
	}
	public void average()
	{
		if(gradec!=0)
		{
			average =total/gradec;
			System.out.printf("%.2f",average);
			System.out.printf("%4S %4S \n","Grades","count");
			System.out.printf("%4S %4d \n","a",ac);
			System.out.printf("%4S %4d \n","b",bc);
			System.out.printf("%4S %4d \n","c",cc);
			System.out.printf("%4S %4d \n","d",dc);
			System.out.printf("%4S %4d \n","f",fc);
		}
		else
		{
			System.out.println("No grades entered");
		}
	}
	
}
