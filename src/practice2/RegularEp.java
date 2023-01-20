package practice2;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegularEp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pp = Pattern.compile(".al.",Pattern.CASE_INSENSITIVE);
		Matcher mm = pp.matcher("walk");
		boolean res = mm.find();
		Pattern p2 = Pattern.compile("wolf$",Pattern.CASE_INSENSITIVE);
		Matcher m2 = p2.matcher("naruto wolf");
		Pattern p3 = Pattern.compile("^hhhello");
		Matcher m3 = p3.matcher("hello naruto");
		Pattern p4 = Pattern.compile("abc|def|hkg");
		Matcher m4 = p4.matcher("def");
		if(m4.find())
		{
			System.out.println(m4.group());
		}
		else {
			System.out.println(m4.find());
		}
		if(m3.find()) {
			System.out.println(m3.group());
		}
		else {
			System.out.println(m3.find());
		}
		if(m2.find())
		{
			System.out.println(m2.group());
		}
		else {
			System.out.println(m2.group());
		}
		
		if(res)
		{
			System.out.println(mm.start());
			System.out.println(mm.end());
			System.out.println(mm.group());
		}
		else {
			System.out.println(res);
		}
	}

}
