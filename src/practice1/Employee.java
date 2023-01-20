package practice1;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double empHwork[] = new double[3];
		double hourRate[] = new double[3];
		double grossPay[] = new double[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter emp-"+(i+1)+" Total Working Hours :");
			empHwork[i] = sc.nextDouble();
			System.out.println("Enter emp-"+(i+1)+" Hourly Rate :");
			hourRate[i] =sc.nextDouble();
		}
		
		for(int i=0;i<3;i++)
		{
			if(empHwork[i]<=40)
			{
				double sum =hourRate[i]*empHwork[i];
				grossPay[i]=sum;
			}else if(empHwork[i]>40)
			{
				double sum =hourRate[i]*40;
				double extraHours = empHwork[i]-40; 
				double sumextraHours = extraHours*1.5;
				sum = sum +(sumextraHours*hourRate[i]);
				grossPay[i]=sum;
			}
		}
		
		System.out.println("Working Hours"+"\t"+"Hourly Rate"+"\t"+"Gross Pay");
		for(int i=0;i<3;i++)
		{
			System.out.println(empHwork[i]+"\t\t"+hourRate[i]+"\t\t"+grossPay[i]);
		}
	}

}
