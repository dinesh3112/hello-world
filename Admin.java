import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Admin {
	static JTextField t;
	static JTextField t1;
	public static void main(String []args)
	{
		JFrame j=new JFrame();
		
		j.setTitle("Sanjay sir is great");
		   j.setContentPane(new JLabel(new ImageIcon("C:\\Users\\user\\Documents\\nature\\wallpaper2you_337472.jpg")));
		  
		JLabel j0=new JLabel(" ADMIN_NAME: ");
		   Font fi=new Font("arial",Font.BOLD,15);
		   j0.setFont(fi);
		   j0.setForeground(Color.BLACK);
		   
		   
		   j0.setBounds(50,10,80,60);
		   j.add(j0);
		   t=new JTextField();
		   t.setBounds(150,20,100,30);
		   j.add(t);
		   t.setColumns(5);
		   
		   JLabel j1=new JLabel("Password:");
		   Font fj=new Font("arial",Font.BOLD,15);
		   j1.setFont(fj);
		   j1.setForeground(Color.BLACK);
		   j1.setBounds(50,60,100,40);
		   j.add(j1);
		   t1=new JPasswordField();
		   t1.setBounds(150,60,100,30);
		   j.add(t1);
		   t1.setColumns(10);
		   
		   JButton j2=new JButton("SUBMIT");
		   j2.setBounds(100,100,100,50);
		   j.add(j2);
		   
		   MyHandler11 m=new MyHandler11(t,(JPasswordField) t1);
		   j2.addActionListener(m);
		   
		   
		j.setLayout(null);
		j.setVisible(true);
		j.setSize(400,440);		
	}
}
class MyHandler11 implements ActionListener
 {
	JTextField t;
	JPasswordField t1;
	//JTextField a;
	//JTextField a1;
	
	MyHandler11(JTextField Q,JPasswordField Q2)
	{
		t=Q;
		t1=Q2;
		
	}
	  public void actionPerformed(ActionEvent e)
	  {
		 String DBuser = null;
		  String DBpass=null;
		 /* String user;
		  String pass;
		 
		  
	    	user=t.getText();
		    pass=t1.getText();*/
		 
			  try {

	     		 Class.forName("com.mysql.jdbc.Driver");
	     	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Company","root","dinesh");
	     	Statement s=c.createStatement(); 
	     	ResultSet rs=s.executeQuery("select *from Employee");
			if(rs.next())
	     	{
	          //  DBuser=rs.getString(1);
				//DBpass=rs.getString(2);
			 	
	     	}
			c.close();
	     	s.close();
			  } catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
			  if(e.getActionCommand().equals("SUBMIT"));
			  {
				  String DBuser1=t.getText(); 
				  String DBpass1=t1.getText(); 
				  if (DBuser1.equals("roseindia") && DBpass1.equals("iht")) { 
					  System.out.println("welcomee");	
					  new Client();
				
				  } 
				  else{ 
				  System.out.println("enter the valid username and password"); 
				  JOptionPane.showMessageDialog(t,"Incorrect login or password","Error",JOptionPane.ERROR_MESSAGE); 
				  } 
				 
	    /* if(user.equals("DBuser"))
	     	{
	     		 
	     		System.out.println("user vallid");
	     		new Client();
	     	}
 	     	else 
	     	{
	     	System.out.println("permission denied");*/
	     	
	     	}
	    }
    }










  

