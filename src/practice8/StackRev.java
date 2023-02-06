package practice8;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class StackRev {

	public static void stackrev(Stack<Integer> stack)
	{
		Stack<Integer> temp = new Stack<>();
		while(!stack.empty())
		{
			int top=stack.pop();
			while(!temp.empty() && temp.peek()>top)
			{
				stack.push(temp.pop());
			}
			temp.push(top);
		}
		System.out.println("The sorted array is");
		System.out.println(temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of stack");
		int n=sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		System.out.println("Enter elements int stack (each ele in new line)");
		for(int i=0;i<n;i++)
		{
			Integer a = sc.nextInt();
			stack.push(a);
		}
		stackrev(stack);
		}
		catch(InputMismatchException nse)
		{
			System.out.println("Check input ");
		}
	}

}
