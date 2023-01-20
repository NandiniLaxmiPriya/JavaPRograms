package practice3;

public class HexaCoversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char c ='G';
		System.out.println((int)c);
		int n=(int)c;
		System.out.println(Integer.toString(n,16));
		System.out.println("----------------------------------------->>>>");
		///////////////////////////////////////////////
		*/
		String s = "IronMan part 3";
		char h[] = new char[s.length()];
		s.getChars(0,s.length(), h, 0);
		String res="";
		for(int i=0;i<h.length;i++)
		{
			//System.out.println(h[i]);
			int n = (int)h[i];
			res = res + String.valueOf(Integer.toString(n,16));
		}
 		System.out.println(res);
 		System.out.println(Integer.toString(103,16));
	}

}
