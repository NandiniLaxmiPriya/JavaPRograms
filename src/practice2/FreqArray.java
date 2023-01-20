package practice2;
import java.util.Scanner;
public class FreqArray {

	public static void respFreq(int a[],int n)
	{
		int fre[] = new int[6];
		for(int i=0;i<n;i++)
		{
			fre[a[i]]+=1;
		}
		for(int i=1;i<6;i++)
		{
			System.out.printf("%d-%d\n",i,fre[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		respFreq(a,a.length);
		
	}

}
