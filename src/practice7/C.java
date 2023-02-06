package practice7;

class C{
private static int apples = 0;
private int mangoes = 0;
private String name;
public C(String n){
name = n;
}
C(){
}
public void addApples(int newApples){
apples += newApples;
}
public void addMangoes(int newMangoes){
mangoes += newMangoes;
}
public void printApples(){
System.out.println(name + " has "+ apples +" apples.");
}
public void printMangoes(){
System.out.println(name + " has " + mangoes + " mangoes.");
}
public static void main(String[] args){
	// see the Code Snippet at the beginning for definitions of class C
	C c = new C();
	c.addMangoes(5);
	processMangoes(c);
	c.printMangoes();
	System.out.println("-----------");
    C c1 = new C("c1");
    C c2 = new C("c2");
	c1.addApples(5); 
	c2.addApples(10);
	c1.addMangoes(15); 
	c2.addMangoes(20);

	c1.printApples();
	c2.printApples(); 
	c1.printMangoes(); 
	c2.printMangoes();
	}
	public static void processMangoes(C c1){
	c1 = new C();
	c1.addMangoes(15);
	c1.printMangoes();
	
	
	}
}