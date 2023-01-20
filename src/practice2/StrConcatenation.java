package practice2;

public class StrConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = "def";
		StringBuilder br1 = new StringBuilder(s1);
		StringBuilder br2 = new StringBuilder(s2);
		StringBuilder s = br1.append(br2);
		System.out.println(s.toString());
		
		String s3 = String.format("%s%s",s1,s2);
		System.out.println(s3.toString());
		
		String s4 =String.join("",s,s3);
		System.out.println(s4.toString());
	}

}
