import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
class english implements ActionListener
{
   JTextField[] t=new JTextField[4];
   JLabel[] l=new JLabel[5];
   JLabel head;
   JPanel[] p=new JPanel[8];
   JFrame f=new JFrame();
  
   english()
   {
     l[0]=new JLabel("SMS            ");
	 l[1]=new JLabel("English Word   ");
	 l[2]=new JLabel("Abbreviation   ");
	 l[3]=new JLabel("Full Form      ");
	 l[4]=new JLabel("                                   ");
	 
	 head=new JLabel("SMS & Abbrevation Words");
	 head.setFont(new Font("Monaco",Font.PLAIN,20));
	 
	 for(int j=0;j<4;j++)
	 {
	   t[j]=new JTextField(15);
	   t[j].addActionListener(this);
	   l[j].setFont(new Font("Monaco",Font.PLAIN,15));
	 }
	 for(int j=0;j<8;j++)
	 {
	   p[j]=new JPanel();
	 }
	 for(int j=0;j<=3;j++)
	 {
	   p[j].setLayout(new java.awt.FlowLayout());
	 }
	 for(int j=5;j<6;j++)
	 {
	  p[j].setLayout(new java.awt.BorderLayout());
	 }
	 
	 p[4].setLayout(new java.awt.GridLayout(5,1,0,0));
	 p[6].setLayout(new java.awt.GridLayout(3,1,0,0));
	 
	 p[7].setLayout(new java.awt.FlowLayout());
	 p[7].add(head);
	 
	 for(int j=0;j<=3;j++)
	 {
	   p[j].add(l[j]);
	   p[j].add(t[j]);
	 }
	 
	 p[4].add(head);
	 p[4].add(l[4]);
	 p[4].add(l[4]);
	 p[4].add(p[0]);
	 p[4].add(p[1]);
	 
	 p[5].add(p[2],java.awt.BorderLayout.NORTH);
	 p[5].add(p[3],java.awt.BorderLayout.CENTER);
	 
	 p[6].add(p[4]);
	 p[6].add(p[5]);
	  
	 
	  f.setLayout(new java.awt.FlowLayout());
      f.setSize(600,600);
      f.setVisible(true);
	 
	  
	  f.add(p[6]);
	}
	public void actionPerformed(ActionEvent e) 
    {
	  if(e.getSource()==t[0])
	  {
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/englishwords","root","Jeyakumar28");
        Statement smt=conn.createStatement();
        String x=t[0].getText();
        ResultSet rs=smt.executeQuery("SELECT englishword FROM smswords WHERE sms='"+x+"'");
		String y;
		while(rs.next())
		{
		 t[1].setText(rs.getString("englishword"));
		}
		}
		catch(Exception e1){}
	  }
	  if(e.getSource()==t[1])
	  {
	    try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/englishwords","root","Jeyakumar28");
	    Statement smt=conn.createStatement();
	    String x=t[1].getText();
		String y;
	    ResultSet rs=smt.executeQuery("SELECT sms FROM smswords WHERE englishword='"+x+"'");
	    while(rs.next())
		{
		  t[0].setText(rs.getString("sms"));
		}
		}
		catch(Exception e1){}
	  }
	  if(e.getSource()==t[2])
	  {
	    try
	    {	
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/englishwords","root","Jeyakumar28");
	    Statement smt=conn.createStatement();
	    String x=t[2].getText();
	    String y;
		ResultSet rs=smt.executeQuery("SELECT full FROM abbreviation WHERE abb='"+x+"'");
	    while(rs.next())
		{
		 t[3].setText(rs.getString("full"));
		}
		}
		catch(Exception e1){}
	  }
	  if(e.getSource()==t[3])
	  {
		  try
          {		  
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/englishwords","root","Jeyakumar28");
		  Statement smt=conn.createStatement();
		  String x=t[3].getText();
		  String y;
    	  ResultSet rs=smt.executeQuery("SELECT abb FROM abbreviation WHERE full='"+x+"'");
		  while(rs.next())
		  {
		   t[2].setText(rs.getString("abb"));
		  }
		  }
		  catch(Exception e1){}
	  }
	} 
  }	 
public class Dictionary
{
  public static void main(String agrs[])
{
  new english();
  }
}
    