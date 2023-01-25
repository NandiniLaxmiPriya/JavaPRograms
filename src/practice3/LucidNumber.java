package practice3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LucidNumber {

	public static void findLucid(int n)
	{
		List<Integer> l1 = new LinkedList<>();
		List<Integer> l2 = new LinkedList<>();
		List<Integer> l3 ;
		l1.add(1);
		for(int i=2;i<n+1;i++)
		{
			l2.add(i);
		}
		System.out.println(l2);
		int j=2;
		int i=0;
		int k=0;
		while(l2.size()!=0)
		{
			l1.add(l2.get(0));
			l2.remove(0);	
			i=j;
			k=0;
			System.out.println(l2+" hey");
			l3= new LinkedList<>();
			while(k<=n && l2.size()>0)
			{
				if(k==i)
				{
					i=i+j;	
					
					
				}else {
					l3.add(l2.get(k));
				}
				System.out.println(k+" angry "+i);
				k=k+1;
				
			}
			System.out.println(l3+"hehe");
			l2= new LinkedList<>(l3);
		
			System.out.println(l2+"hmm");
			j=j+1;
		}
		System.out.println(l1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
	//	int n = sc.nextInt();
		findLucid(10);
	}

}
