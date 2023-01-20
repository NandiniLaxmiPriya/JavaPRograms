package practice1;
import java.util.Scanner;
public class ParkingCharges {

	private static double cost;
	private static double add =0.50;
	public static double calculateCharges(int hour)
	{
		if(hour<24)
		{
		if(hour<=3)
		{
			cost = 2;
		}
		else if(hour>3)
		{
			double extra = hour-3;
			cost = 2 + extra*add;
		}
		}else if(hour==24)
		{
			cost=10;
		}
	
		return cost;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int chour[] =new int[5];
		double ccost[] =new double[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.printf("%10s %5d\n","Enter Hours parked by customer " ,(i+1));
			chour[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.print(chour[i]);
			ccost[i]=calculateCharges(chour[i]);
		}
		
		System.out.printf("%-6s %-6s\n","hours parked","charges calculated");
		for(int i=0;i<5;i++)
		{
			System.out.println(chour[i]+" "+ccost[i]);
		}

	}

}
