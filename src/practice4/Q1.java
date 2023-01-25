package practice4;

public class Q1 {
	public static <T> void printArray(T[] arr,String type)
	{
		System.out.println("The array is of type "+type);
		System.out.println("The elemensts in array are");
		for(T i :arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer iarr[] = {1,2,3,4,5};
		Double darr[] = {1.2,2.2,3.3,4.2,5.2};
		Character carr[] = {'A','B','C','D','E'};
		printArray(iarr,"Integer");
		System.out.println();
		printArray(darr,"Double");
		System.out.println();
		printArray(carr,"Character");
		

	}

}
