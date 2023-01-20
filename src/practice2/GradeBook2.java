package practice2;

public class GradeBook2 {
	private static String courseName;
	private static int grades[][];
	public GradeBook2(String courseName,int grades[][])
	{
		this.courseName = courseName;
		this.grades = grades;
	}
	public String getCoursename()
	{
		return courseName;
	}
	public static void getMinimum()
	{
		int min = grades[0][0];
		for(int i=0;i<grades.length;i++)
		{
			for(int j:grades[i])
			{
				if(j<min)
				{
					min=j;
				}
			}
		}
		System.out.println("The minimum is"+min);
	}
	public static void getMaximum()
	{
		int max = grades[0][0];
		for(int i=0;i<grades.length;i++)
		{
			for(int j:grades[i])
			{
				if(j>max)
				{
					max=j;
				}
			}
		}
		System.out.println("The minimum is"+max);
	}
	public static double average(int rowOfGrades[])
	{
		int total=0;
		double average=0;
		for(int i :rowOfGrades)
		{
			total+=i;
		}
		average=total/rowOfGrades.length;
		return average;
	}
	public static void gradeBarChart()
	{
		int freq[]=new int[11];
		for(int i=0;i<grades.length;i++)
		{
			for(int j:grades[i])
			{
				freq[j/10]+=1;
			}
		}
		int c=0;
		for(int i=0;i<11;i++)
		{
			if(i==10)
			{
				System.out.printf("%5d:",100);
			}
			else {
			System.out.printf("%d %d:",(c*10),(9+c*10));
			}
			for(int j=0;j<freq[i];j++)
			{
				System.out.printf("%s","*");
			}
			c=c+1;
			System.out.println();
		}
	}
	public static void displayGrades() {
		
		for(int i=0;i<3;i++)
		{
			System.out.printf("Test%d ",(i+1));
		}
		System.out.printf("%s","Average");
		System.out.println();
		for(int i=0;i<grades.length;i++)
		{
			for(int j : grades[i])
			{
				System.out.printf("%-5d ",j);
			}
		
				System.out.printf("%10f ",average(grades[i]));
			
			System.out.println();
		}
		
	}
	public static void displayReport()
	{
		getMinimum();
		getMaximum();
		
		gradeBarChart();
	}
}
