  package practice4;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;
public class TohRecur {

	static Map<Character,Stack<Integer>> hm;
	public TohRecur(int n)
	{
		hm = new HashMap<Character,Stack<Integer>>();
		hm.put('A',new Stack<Integer>());
		hm.put('B',new Stack<Integer>());
		hm.put('C',new Stack<Integer>());
		for(int i=n;i>0;i--)
		{
			hm.get('A').push(i);
		}
	}
	public static void solvee(int n,Character A, Character B, Character C)
	{
		Stack<Integer> start = hm.get(A);
		Stack<Integer> end = hm.get(C);
		
		if(n==1)
		{
			end.push(start.pop());
			print();
		}
		else {
			solvee(n-1,A,C,B);
			end.push(start.pop());
			print();
			solvee(n-1,B,A,C);
			
			
		}
	}
	public static void print()
	{
		System.out.println();
		for(Character c: hm.keySet())
		{
			System.out.println("tower "+c+":"+hm.get(c));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TohRecur th = new TohRecur(3);
		print();
		solvee(3,'A','B','C');

	}

}
