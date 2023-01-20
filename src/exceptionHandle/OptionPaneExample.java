package exceptionHandle;
import javax.swing.*;
public class OptionPaneExample {
/*JFrame f;  
    OptionPaneExample(){  
        f=new JFrame();   
        String name=JOptionPane.showInputDialog(f,"Enter Name");      
    }  */
	JFrame f;
	static String name;
	OptionPaneExample()
	{
		f = new JFrame();
		name = JOptionPane.showInputDialog(f,"Enter Score");
	}
	public static void display()
	{
		System.out.println(name);
	}
	public static void main(String args[])
	{
		OptionPaneExample op =new OptionPaneExample();
		op.display();
	}
}
