package practice1;

public class Helo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*double x=0;
		System.out.printf("%4s %20s %n","sno","value");
		for(int i=0,j=0;i<10 && j<5;i++,j++)
		{
			System.out.printf("%4d%,20.4f \n",i,x);
			//System.out.printf( "%4d%,20.2f\n", i, x);
		}*/
		//int i=149876;
		//System.out.printf("%-+,4d",i);
		char ch='A';
		switch(ch)
		{
		case 'A':
		case 'B':
		case 'D':
			System.out.println("111");
			break;
		default:
			System.out.println("heh");
		}
		int i, j;
		for (i=0, j=0; i+j < 20; ++i, j+=i--)
		{
		System.out.println("i+j = " + (i+j));
		}
	}

}
