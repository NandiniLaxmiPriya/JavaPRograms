package practice7;

import java.util.HashMap;
import java.util.Map;

public class MinInsert {
	public int minInsertions(String s) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
        	String ch = String.valueOf(s.charAt(i));
        	if(hm.containsKey(ch))
        	{
        		int k = hm.get(ch);
        		k=k+1;
        		hm.put(ch, k);
        	}
        	else {
        		hm.put(ch, 1);
        	}
        }
        System.out.println(hm);
        int ans=0;
        for(Map.Entry<String,Integer> h:hm.entrySet())
        {
        	int val = h.getValue();
        	if(val%2!=0)
        	{
        		ans=ans+1;
        	}
        }
        return ans-1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mbadm";
		MinInsert mins = new MinInsert();
		System.out.println(mins.minInsertions(s));
	}

}
