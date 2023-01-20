package practice1;

public class Oddsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,count=0;
		for(int i=1;i<=99;i++)
		{
			if(i%2!=0)
			{
				sum+=i;
				count+=1;
			}
		}
		System.out.printf("%+5d %05d \n",sum,count);
		System.out.println(Math.pow(2.5, 3));
		for(int i=1;i<=20;i++)
		{
			System.out.print(i);
			if(i%5==0)
			{
				System.out.println();
			}
			else {
				System.out.print("\t");
			}
			
		}
	}

}
