package practice3;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sarr[] = {"sad","sadly","sadness"};
		String s =sarr[0];
		String result="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				String sub = s.substring(i,j);
			//	System.out.println(s.substring(i,j));
				int k = 1;
				for(k=1;k<sarr.length;k++)
				{
					if(!sarr[k].contains(sub))
						break;
				}
				if(k==sarr.length && result.length()<sub.length())
				{
					result=sub;
				}
			}
		}
		System.out.println(result);
		
	}

}
