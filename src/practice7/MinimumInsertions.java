package practice7;
import java.util.Scanner;
public class MinimumInsertions {
	public static int minIns(char X[],char Y[],int m,int n )
	{
		if(m==0 || n==0)
			return 0;
		if(X[m-1]==Y[n-1]) {
			return 1+minIns(X,Y,m-1,n-1); //if the last characters are equal then the values of m and n are decremented 
		}
		else {
			return Math.max(minIns(X,Y,m,n-1),minIns(X,Y,m-1,n));//if not 
			/*
			 * mbadm
			 * mdabm
			 * at last index m==m then pointer comes to 
			 * d==b ? no
			 * then the last character of mbad is checked with mda 
			 * to check if any character is equal  
			 * */
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to make palindrome");
		String s1 = sc.next();
		StringBuilder sb = new StringBuilder(s1);
		sb.reverse();
		String s2 =sb.toString();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int m = s1.length();
		int n = s2.length();
		
		int len = minIns(ch1,ch2,m,n);
	
		/*The minIns function finds longest palindromic subsequence
		 * 
		 * the input string is reversed and longest subsequence of s1 and s2 gives the longest palindrome
		 * example: mbadm
		 * reverse : mdabm 
		 * longest subsequence is mam the other 2 characters - b,d 
		 * can be inserted as  mb d ad b m to make it a palindrome
		 *  */
		int ans=m-len;
		System.out.println("The minimum insertions required are "+ ans);
	}

}
