package practice2;

public class Elipsis {

	public static void sum(double... nums)
	{
		double sum=0;
		for(double i :nums)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(1,2,3,4,5,6,7,8,9,10);
	}

}
