package practice2;

public class Time2 {

	private int hour;
	private int min;
	private int second;
	
	public void setTime(int h,int m,int s)
	{
		if((h>=0 && h<24) && (m>=0 && m<60) && (s>=0&&s<60))
		{
			this.hour=h;
			this.min=m;
			this.second=s;
		}
		else {
			throw new IllegalArgumentException("Input time correctly");
		}
	}
	public Time2()
	{
		this.hour=0;
		this.min=0;
		this.second=0;
	}
	public Time2(int hour,int min)
	{
		this.hour=hour;
		this.min=min;
		this.second=0;
	}
	public Time2(int hour ,int min,int second)
	{
		setTime(hour,min,second);
	}
	public Time2(Time2 time)
	{
		this(time.getHour(),time.getMin(),time.getSecond());
	}
	public int getHour()
	{
		return this.hour;
	}
	public int getMin()
	{
		return this.min;
	}
	public int getSecond()
	{
		return this.second;
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
