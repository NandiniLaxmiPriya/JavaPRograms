package practice2;

public class StringBufBuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder bui = new StringBuilder("Hey");
		bui.append("Hello");
		System.out.println(bui.toString());
		bui.replace(0, 1,"wh");
		System.out.println(bui.toString());
		bui.delete(0, 1);
		System.out.println(bui.toString());
		System.out.println(bui.capacity());
		StringBuffer buf = new StringBuffer("World of colors");
		buf.reverse();
		System.out.println(buf.toString());
		buf.substring(0,5);
		System.out.println(buf.substring(0,5));
	}

}
