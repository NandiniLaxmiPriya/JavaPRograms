package practice3;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<String,String> hm = new HashMap<>();
        boolean ans=true;
        for(int i=0;i<s.length();i++)
        {
            String map = String.valueOf(s.charAt(i));
            String mapto = String.valueOf(t.charAt(i));
            if(!hm.containsKey(map) )
            {
            	if(hm.containsValue(mapto))
            	{
            		hm.put(map, "");
            	}
            	else {
                hm.put(map,mapto);
            	}
            }
        }
        System.out.println(hm);
        for(int i=0;i<s.length();i++)
        {
        	String tmap=String.valueOf(t.charAt(i));
        	String smap=String.valueOf(s.charAt(i));
        	if(hm.containsKey(smap))
        	{
        		String tcopy = hm.get(smap);
        		if(!tcopy.equals(tmap))
        		{
        			System.out.println(hm.get(smap)+" "+tmap);
        			ans=false;
        		}
        	}
        }
        return ans;
    }
}
public class Isomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t ="baba";
		String s="badc";
		Solution sh = new Solution();
		System.out.println(sh.isIsomorphic(s, t));;
	}

}
