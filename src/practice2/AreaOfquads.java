package practice2;
import java.util.*;
class Quadrilateral{
	private int x1;
	private int x2;
	private int x3;
	private int x4;
	private int y1,y2,y3,y4;

	Pointt pp = new Pointt();
	
	public void setx1()
	{
		System.out.println("Enter x1 value");
		this.x1=pp.coord();
	}
	public void setx2()
	{
		System.out.println("Enter x2 value");
		this.x2=pp.coord();
	}
	public void setx3()
	{
		System.out.println("Enter x3 value");
		this.x3=pp.coord();
	}
	public void setx4()
	{
		System.out.println("Enter x4 value");
		this.x4=pp.coord();
	}
	public void sety1()
	{
		System.out.println("Enter y1 value");
		this.y1=pp.coord();
	}
	public void sety2()
	{
		System.out.println("Enter y2 value");
		this.y2=pp.coord();
	}
	public void sety3()
	{
		System.out.println("Enter y3 value");
		this.y3=pp.coord();
	}
	public void sety4()
	{
		System.out.println("Enter y4 value");
		this.y4=pp.coord();
	}
	public int getx1()
	{
		return x1;
	}
	public int getx2()
	{
		return x2;
	}
	public int getx3()
	{
		return x3;
	}
	public int getx4()
	{
		return x4;
	}
	public int gety1()
	{
		return y1;
	}
	public int gety2()
	{
		return y2;
	}
	public int gety3()
	{
		return y3;
	}
	public int gety4()
	{
		return y4;
	}
	public void area()
	{
		
	}
}
class Trapezoid extends Quadrilateral{
	int x1 ;
	 int x2;
	 int x3;
	 int x4;
	 int y1;
	 int y2;
	 int y3;
	 int y4;
	 int ax;
		int ay;
		int an;
		int bx;
		int by;
		int bn;
		int ans;
		int Height;
		
		
	Trapezoid(Quadrilateral qd,int h)
	{
		this.x1 = qd.getx1();
		this.x2 = qd.getx2();
		 this.x3 = qd.getx3();
		 this.x4 = qd.getx4();
		 this.y1 = qd.gety1();
		 this.y2 = qd.gety2();
		 this.y3 = qd.gety3();
		 this.y4 = qd.gety4();
		 this.Height=h;
		 ax= (int)Math.pow(this.x2-this.x1,2);
		 ay= (int)Math.pow(this.y2-this.y1,2);
		 an=(int)Math.sqrt(ax+ay);
		 bx= (int)Math.pow(this.x4-this.x3,2);
		 by= (int)Math.pow(this.y4-this.y3,2);
		 bn=(int)Math.sqrt(bx+by);
		  ans = an+bn;
		  ans= ans*Height;
		  ans=ans/2;
	}
	public void area()
	{
	/*	System.out.println(x1+"-x1 "+x2+"-x2 "+x3+"-x3 "+x4+"-x4 ");
		System.out.println(y1+"-y1 "+y2+"-y2 "+y3+"-y3 "+y4+"-y4 ");
		System.out.println("an "+an+"ax "+ax+"ay "+ay);
		System.out.println("bn "+bn+"bx "+bx+"by "+by);
		System.out.println("Height"+Height);*/
		System.out.println("The length is "+an);
		System.out.println("The breadth is "+bn);
		System.out.println("The height is "+Height);
		System.out.println("The area of trapezoid is (1/2)*Height*(l+b) = "+ans);
	}
}
class Parallelogram extends Quadrilateral{
	int x1 ;
	 int x2;
	 //int x3;
	 //int x4;
	 int y1;
	 int y2;
	 //int y3;
	 //int y4;
	 int ax;
		int ay;
		int an;
		int bx;
		int by;
		int bn;
		int ans;
		int Height;
		Parallelogram(Quadrilateral qd)
		{
			
		}
		
		
	Parallelogram(Quadrilateral qd,int h)
	{
		this.x1 = qd.getx1();
		this.x2 = qd.getx2();
	//	 this.x3 = qd.getx3();
	//	 this.x4 = qd.getx4();
		 this.y1 = qd.gety1();
		 this.y2 = qd.gety2();
	//	 this.y3 = qd.gety3();
	//	 this.y4 = qd.gety4();
		 this.Height=h;
		 ax= (int)Math.pow(this.x2-this.x1,2);
		 ay= (int)Math.pow(this.y2-this.y1,2);
		 an=(int)Math.sqrt(ax+ay);
		// bx= (int)Math.pow(this.x4-this.x3,2);
		 //by= (int)Math.pow(this.y4-this.y3,2);
		// bn=(int)Math.sqrt(bx+by);
		  ans = an;
		  ans= ans*Height;
		  
	}
	public void area()
	{
		System.out.println("The base is "+an);
		System.out.println("The height is "+Height);
		System.out.println("The area of parallelogram is base*height = "+ans);
	}
}
class Rectangle extends Parallelogram{

		int x1 ;
		int x2;
		int x3;
		int x4;
		int y1;
		int y2;
		int y3;
		int y4;
		int ax;
		int ay;
		int an;
		int bx;
		int by;
		int bn;
		int ans;
	Rectangle(Quadrilateral qd) {
		super(qd);
		this.x1 = qd.getx1();
		this.x2 = qd.getx2();
		 this.x3 = qd.getx3();
		 this.x4 = qd.getx4();
		 this.y1 = qd.gety1();
		 this.y2 = qd.gety2();
		 this.y3 = qd.gety3();
		 this.y4 = qd.gety4();
		 ax= (int)Math.pow(this.x2-this.x1,2);
		 ay= (int)Math.pow(this.y2-this.y1,2);
		 an=(int)Math.sqrt(ax+ay);
		 bx= (int)Math.pow(this.x4-this.x3,2);
		 by= (int)Math.pow(this.y4-this.y3,2);
		 bn=(int)Math.sqrt(bx+by);
		  ans = an*bn;
		
	}
	public void area()
	{
		System.out.println("The length is "+an);
		System.out.println("The breadth is "+bn);
		System.out.println("The area of rectangle is length*breadth = "+ans);
	}
	
}

class Square extends Rectangle{

	int x1 ;
	int x2;
	
	int y1;
	int y2;
	
	int ax;
	int ay;
	int an;
	
	int ans;
	Square(Quadrilateral qd) {
		super(qd);
		this.x1 = qd.getx1();
		this.x2 = qd.getx2();
		 this.x3 = qd.getx3();
		 this.x4 = qd.getx4();
		 this.y1 = qd.gety1();
		 this.y2 = qd.gety2();
		 this.y3 = qd.gety3();
		 this.y4 = qd.gety4();
		 ax= (int)Math.pow(this.x2-this.x1,2);
		 ay= (int)Math.pow(this.y2-this.y1,2);
		 an=(int)Math.sqrt(ax+ay);
		
		  ans = an*an;
	}
	public void area()
	{
		System.out.println("The length is "+an);
		
		System.out.println("The area of square is length*length = "+ans);
	}
	
}
public class AreaOfquads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrilateral qd = new Quadrilateral();
		qd.setx1();
		qd.sety1();
		
		
		qd.setx2();
		qd.sety2();
		
		qd.setx3();
		qd.sety3();
		
		qd.setx4();
		qd.sety4();
	/*	System.out.println("x1 "+qd.getx1());
		System.out.println("y1 "+qd.gety1());
		System.out.println("x2 "+qd.getx2());
		System.out.println("y2 "+qd.gety2());
		System.out.println("x3 "+qd.getx3());
		System.out.println("y3 "+qd.gety3());
		System.out.println("x4 "+qd.getx4());
		System.out.println("y4 "+qd.gety4());
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height of trapezoid");
		Trapezoid tp = new Trapezoid(qd,sc.nextInt());
		System.out.println("Enter height of parallelogram");
		Parallelogram pp = new Parallelogram(qd,sc.nextInt());
		Rectangle rr = new Rectangle(qd);
		Square ss = new Square(qd);
		tp.area();
		pp.area();
		rr.area();
		ss.area();
		
	}

}
