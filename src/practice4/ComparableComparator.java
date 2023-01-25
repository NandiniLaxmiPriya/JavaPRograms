package practice4;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Movie implements Comparable<Movie>
{
	private double rating;
	private String name;
	private int year;
	public Movie(double r, String n, int y)
	{
		this.rating = r;
		this.name = n;
		this.year = y;
		}
	public int compareTo(Movie m)
	{
		return this.year - m.year;
	}
	public double getRating() {
		return rating;
	}
	
	public String getName() {
		return name;
	}
	
	public int getYear() {
		return year;
	}
}

class RateCompare implements Comparator<Movie>
{
	public int compare(Movie m1,Movie m2)
	{
		if(m1.getRating()>m2.getRating()) return 1;
		else if(m1.getRating()<m2.getRating()) return -1;
		else return 0;
	}
}
class NameCompare implements Comparator<Movie>
{
	public int compare(Movie m1,Movie m2)
	{
		return m1.getName().compareTo(m2.getName());
	}
}
public class ComparableComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie> al = new ArrayList<>();
		al.add(new Movie(3.5,"One",1999));
		al.add(new Movie(4,"Two",2001));
		al.add(new Movie(4.5,"Three",2020));
		al.add(new Movie(5,"June",2008));
		System.out.println("Sort using years");
		System.out.println();
		Collections.sort(al);
		for(Movie m:al)
		{
			System.out.println(m.getName()+" "+m.getRating()+" "+m.getYear());
		}
		System.out.println();
		System.out.println("Sort using names");
		NameCompare nc = new NameCompare();
		Collections.sort(al,nc);
		for(Movie m:al)
		{
			System.out.println(m.getName()+" "+m.getRating()+" "+m.getYear());
		}
		System.out.println();
		System.out.println("Sort using ratings");
		RateCompare rc = new RateCompare();
		Collections.sort(al,rc);
		for(Movie m:al)
		{
			System.out.println(m.getName()+" "+m.getRating()+" "+m.getYear());
		}
		
	}

}
