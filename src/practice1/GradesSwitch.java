package practice1;

import java.util.Scanner;

public class GradesSwitch {

	public static void findPoint(int v)
	{
		switch(v)
		{
		case 10:
		case 9:
			System.out.println("4");
			break;
		case 8:
			System.out.println("3");
			break;
		case 7:
			System.out.println("2");
			break;
		case 6:
			System.out.println("1");
			break;
		default:
			System.out.println("0");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int avg =sc.nextInt();
		findPoint(avg/10);
		

	}

}
