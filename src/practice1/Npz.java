package practice1;

import java.util.Scanner;

public class Npz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n;
		int nn=0;
		int np=0;
		int nz=0;
		int i=0;
		while(i<5){
			n=sc.nextInt();
			if(n==0)
			{
				nz+=1;
			}
			else if(n>0)
			{
				np+=1;
			}
			else if(n<0)
			{
				nn+=1;
			}
			i=i+1;
		}
		System.out.println("no of negative nums "+nn);
		System.out.println("no of positive nums "+np);
		System.out.println("no of zeros "+nz);
	}

}
