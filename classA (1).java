package smollProject;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class classA {


  static JTextField A;
  static JTextField B;

  public static void main(String arg[])
	 {
	  
		JFrame frame=new JFrame();
		frame.setContentPane(new JLabel(new ImageIcon("F:\\Eclipse Programing Files\\image\\105.jpg")));
		JLabel  L1=new JLabel("User Name");
	    frame.add(L1);
	    L1.setBounds(100,100,100,30);
	    frame.add(L1);
	    A=new JTextField();
	    frame.add(A);
	    A.setBounds(200,100,100,30);
	    frame.add(A);
	    
	    JLabel  L2=new JLabel("password");
	    frame.add(L2);
	    L2.setBounds(100,150,100,30);
	    frame.add(L2);
	    
	    B=new JPasswordField();
	    B.setBounds(175,265,150,25);
		   frame.add(B);
		   
	    
	    JButton BB=new JButton("submet");
	    frame.add(BB);
	    BB.setBounds(150,200,100,30);
	    frame.add(BB);
	    
	    MyHandler m=new MyHandler(A,(JPasswordField)B);
	    BB.addActionListener(m);
	    
	    frame.setLayout(null);
	    frame.setSize(500,400);
	    frame.setVisible(true);
	 }
		
}
class MyHandler implements ActionListener
{JTextField A;
JPasswordField B;
//JTextField a;
//JTextField a1;

MyHandler(JTextField Q,JPasswordField Q2)
{
	A=Q;
	B=Q2;
	
}
  public void actionPerformed(ActionEvent e)
  {
	 String DBuser = null;
	  String DBpass=null;
	  
	  if(e.getActionCommand().equals("SUBMIT"));
	  {
		  String DBuser1=A.getText(); 
		  String DBpass1=B.getText(); 
		  if (DBuser1.equals("ganu") && DBpass1.equals("ganu")) { 
			  System.out.println("welcomee");	
			  new classB();
		
		  } 
		  else{ 
		  System.out.println("enter the valid username and password"); 
		  JOptionPane.showMessageDialog(B,"Incorrect login or password","Error",JOptionPane.ERROR_MESSAGE); 
		  } 
		 
			
		}
	}
}


