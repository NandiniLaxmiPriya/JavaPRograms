package practice2;

public class Date {

	private int day;
	private int month;
	private int year;
	
	private int monthDays[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	public Date(int day,int month,int year)
	{
		this.month = checkMonth(month);
		this.day = day;
		this.year = year;
	}
	public int checkMonth(int tmonth)
	{
		if(tmonth>=1 && tmonth<=12)
		{
			return tmonth;
		}
		else {
			throw new IllegalArgumentException("Check input month");
		}
	}
	public int checkDay(int tday)
	{
		if(tday>=1 && tday<=monthDays[month])
		{
			return tday;
		}
		else if(month==2 && tday==29 && ((year%400==0)||(year%4==0 && year%100!=0)))
		{
			return tday;
		}else {
			throw new IllegalArgumentException("Check input day");
		}
	}
	public int checkYear(int tyear)
	{
		if(tyear>=1999 && tyear<=2030)
		{
			return tyear;
		}else {
			throw new IllegalArgumentException("Check input year: year should be in (1999-2030");
		}
	}
	public String toString()
	{
		return String.format("%d-%d-%d",day,month,year);
	}
}
