package practice4;

import java.util.LinkedList;
import java.util.List;

class Play{
	public void print(List<?> list)
	{
		list.forEach((n)->System.out.println(n));
	}
}

class Show extends Play
{
	public void find(List<? extends Play> lis)
	{
		if(lis.equals(4)) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}
}
public class Wildcardss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = new LinkedList<>();
		ls.add(3);
		ls.add(4);
		Play play = new Play();
		play.print(ls);
		Show show = new Show();
		List<Play> ls2 = new LinkedList<>();
		ls2.add(play);
		show.find(ls2);
	}

}
