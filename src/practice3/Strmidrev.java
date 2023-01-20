package practice3;

public class Strmidrev {

	public static void main(String[] args) {
		String s = "Hello World GFG Welcomes hmm haha heheh You";
		String arr[] = s.split(" ");
		String rem="";
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(arr[i]);
			if(i!=0 && i!=arr.length-1)
			{
				rem =rem+arr[i]+" ";
			}
		}
		String etos = arr[arr.length-1];
		String stoe = arr[0];
	//	System.out.println(rem);
	//	System.out.println(rem.charAt(0)+"***");
		StringBuilder sb = new StringBuilder(rem);
		sb.reverse();
	//	System.out.println(sb.toString());
		String res = sb.toString();
		res = etos + res +" "+stoe;
		System.out.println(res);
	}

}
