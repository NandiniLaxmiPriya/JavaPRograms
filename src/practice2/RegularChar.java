package practice2;
import java.util.regex.Pattern;
public class RegularChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[abc]","abc"));//false
		System.out.println(Pattern.matches("[abc]","a"));//true
		
		System.out.println(Pattern.matches("[^abc]","h"));//true
		System.out.println(Pattern.matches("[a-zA-Z]","a"));//true
		System.out.println(Pattern.matches("[a-d[m-p]]","n"));//true
		
		System.out.println(Pattern.matches("[a-d&&[^bc]]","b"));
		System.out.println(Pattern.matches("[a-e&&[^m-p]]","b"));
		
		//Quantifiers
		System.out.println("Quantifiers");
		System.out.println(Pattern.matches("[abc]?","a"));
		System.out.println(Pattern.matches("[abc]*",""));
		System.out.println(Pattern.matches("[abc]+","a"));
		
		//meta characters
		System.out.println("meta characters");
		System.out.println(Pattern.matches("D","a"));
	}

}
