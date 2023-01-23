package practice4;

public class Q4 {
	
	public static void solve(int n, char A, char B, char C) {
		if(n==1)
		{
			System.out.println("Disk "+n+" is shifted from "+A+" to "+C);
		}else {
			solve(n-1,A,C,B);
			System.out.println("Disk "+n+" is shifted from "+A+" to "+C);
			solve(n-1,B,A,C);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
			solve(n,'A','B','C');
	}

}
