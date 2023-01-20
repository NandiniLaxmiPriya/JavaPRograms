package practice1;
import java.util.Random;
public class Randomn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  1 ≤n ≤ 2.
b) 1 ≤n ≤ 100.
c) 0 ≤n ≤ 9.
d) 1000 ≤n ≤ 1112.
e) –1 ≤n ≤ 1.
f) –3 ≤n ≤ 11.*/
		Random rm = new Random();
		int n1 = 1 + rm.nextInt(2);
		System.out.println(n1);
		int n2 = 1 + rm.nextInt(100);
		System.out.println(n2);
		int n3 = rm.nextInt(10);
		System.out.println(n3);
		int n4 = 1000 + rm.nextInt(113);
		System.out.println(n4);
		int n5 = -1 + rm.nextInt(3);
		System.out.println(n5);
		int n = -3 + rm.nextInt(15);
		System.out.println(n);
	}

}
