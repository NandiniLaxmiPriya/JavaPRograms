package practice5;

public class StringEqualss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IlikeSamSungSamSungSungice";
	
		s=s.toLowerCase();
		String a = "i like sam sung samsung mobile ice cream icecream man go mango";
		String arr[]=a.split(" ", -2);
		String ans="";
		
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(i);
			if(s.contains(arr[i]))
			{
				ans=ans+arr[i];
			}
		}
		System.out.println(ans);
		if(s.contains(ans) || ans.contains(s))
		{
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
