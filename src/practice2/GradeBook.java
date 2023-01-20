package practice2;

public class GradeBook {
	private static String courseName;
	private static int grades[];
	public GradeBook(String courseName,int grades[])
	{
		this.courseName = courseName;
		this.grades = grades;
	}
	public String getCoursename()
	{
		return courseName;
	}
	public static void displayGrades()
	{
		System.out.printf("%5s %5s\n","RollNo","Grade");
		for(int i=0;i<grades.length;i++)
		{
			System.out.printf("%-5d %-5d\n",(i+1),grades[i]);
		}
	}
	public static void getMinimum()
	{
		int min = grades[0];
		for(int i=0;i<grades.length;i++)
		{
			if(grades[i]<min)
			{
				min=grades[i];
			}
		}
		System.out.printf("The minimun grade is %d\n",min);
	}
	public static void getMaximum()
	{
		int max = grades[0];
		for(int i=0;i<grades.length;i++)
		{
			if(grades[i]>max)
			{
				max=grades[i];
			}
		}
		System.out.printf("The minimun grade is %d\n",max);
	}
	public static void average()
	{
		int total =0;
		for(int i=0;i<grades.length;i++)
		{
			total+=grades[i];
		}
		double avg = total/grades.length;
		System.out.printf("The average of all grades is %f\n",avg);
	}

	public static void gradeBarChart()
	{
		int freq[] = new int[11];
		for(int i=0;i<grades.length;i++)
		{
			freq[grades[i]/10]+=1;
		}
		for(int i=0;i<11;i++)
		{
			if(i==10)
			{
				System.out.printf("%9s:","100");
			}
			else {
				System.out.printf("%5d-%3d:",(i*10),(9+i*10));
			}
			for(int j=0;j<freq[i];j++) {
				System.out.printf("%s","*");
			}
			System.out.println();
		}
	}
	public static void displayReport()
	{
		getMinimum();
		getMaximum();
		average();
		gradeBarChart();
	}
}
