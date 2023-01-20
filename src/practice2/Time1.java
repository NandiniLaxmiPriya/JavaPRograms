package practice2;

public class Time1 {

	private static int hour=0;
	private static int min=0;
	private  static int second=0;
	
	public static void setTime(int h,int m,int s)
	{
		if((h>=0 && h<24) && (m>=0 && m<60) && (s>=0&&s<60))
		{
			hour=h;
			min=m;
			second=s;
		}
		else {
			throw new IllegalArgumentException("Input time correctly");
		}
	}
	public String toString()
	{
		return String.format("%d:%2d:%2d:%S",(hour==0 || hour==12)?12:(hour%12),min,second,(hour<12)?"Am":"Pm");
	}
	public String toUniversalString()
	{
		return String.format("%d:%-2d:%-2d",hour,min,second);
	}
}
