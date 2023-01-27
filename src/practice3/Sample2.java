package practice3;
abstract class demo

{

    public int a;

    demo()

    {

	a = 10;

    }

 

    abstract public void set();

     

    abstract public void get();

 

}

 

class Sample2 extends demo

{

 

    public void set(int a)

    {

	this.a = a;

    }

 

    public void get()

    {

	System.out.println("a = " + a);

    }

 

    public static void main(String[] args)

    {

	Sample2 obj = new Sample2();

	obj.set(20);

	obj.get();

    }



	@Override
	public void set() {
		// TODO Auto-generated method stub
		
	}

}