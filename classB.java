package smollProject;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class classB {
	JMenu Menu,Manu1,subMenu,subMenu1;
	JMenuItem A1,A2,B1,B2,R1;
	classB()
	{
	    JFrame J=new JFrame();
		JMenuBar bar=new JMenuBar();
		Menu=new JMenu("School Picher");
		subMenu=new JMenu("Class Rooms");
		A1=new JMenuItem("Class B.com");
		A1=new JMenuItem("Class BCA");
		subMenu=new JMenu("Class Librery");
		B1=new JMenuItem("Class B.com");
		B2=new JMenuItem("Class BCA");
		
		subMenu.add(A1);subMenu.add(A2);subMenu1.add(B1);subMenu1.add(B2);
		
		bar.add(Menu);
		J.setJMenuBar(bar);
		
}


		
		
	
	public static void main(String arg[])
	{
		new classB();
	}
}
