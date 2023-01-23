package practice4;

import java.util.Collections;
import java.util.Stack;

public class StackPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(11);
		stack.push(14);
		stack.push(13);
		stack.push(12);
		if(stack.isEmpty())
		{
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(Collections.min(stack));
	}

}
