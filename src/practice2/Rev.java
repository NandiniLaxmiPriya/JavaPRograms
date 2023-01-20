package practice2;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="Hello World GFG Welcomes You";
		String s2[] =s.split(" ");
		String temp="";
		String temp2="";
		for(int i=0;i<s2.length;i++)
		{
			//System.out.println(s2[i]);
			if(i==0)
			{
				temp=s2[i];
				s2[i]=s2[s2.length-1];
			}
			else if(i==s2.length-1)
			{
				s2[s2.length-1]=temp;
			}
			
		}
		for(int i=0;i<s2.length;i++)
		{
			System.out.println(s2[i]);
		}
		
	}

}
