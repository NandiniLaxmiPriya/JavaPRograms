package practice4;

import java.util.Stack;

class StackOp
{
	public <T> Stack<T> push(Stack<T> stack, T[] arr, String name)
	{
		for(T i :arr)
		{
			stack.push(i);
		}
		return stack;
	}
	
	public <T> void pop(Stack<T> stack)
	{
		while(stack.size()>0)
		{
			System.out.println(stack.peek());
			stack.pop();
		}
	}
	
}
public class GenericStack {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOp sk = new StackOp();
		Integer arr[] = {1,2,3,4,5};
		Stack<Integer> sn = new Stack<>();
		sn = sk.push(sn, arr,"Integer");
		
		sk.pop(sn);
		
	}

}
