package exceptionHandle;
import java.util.Scanner;
class NameNotFound extends Exception
{
	public NameNotFound(String str)
	{
		super(str);
	}
}
public class Three {

	public static void exists(String emp[],String newEmp) throws NameNotFound
	{
		try
		{
			int c =0;
			for(int i=0;i<emp.length;i++)
			{
				if(emp[i].equals(newEmp))
				{
					c=c+1;
				}
			}
			if(c==0) {
				throw new NameNotFound("Name doesn't exists");
			}
			else {
				System.out.println("Name exists");
			}
		}catch(NameNotFound e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) throws NameNotFound{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of employees");
		
		int n=sc.nextInt();
		System.out.println("Enter names of employee");
		String emp[] = new String[n] ;
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=sc.next();
		}
		System.out.println("Enter employee to be searched");
		String newEmp = sc.next();
		exists(emp,newEmp);
	}

}
