import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class AWTCont implements ActionListener{
  	JButton b1,b2,b3;
  	JTextField t1;
  	JLabel l1;
  	JFrame f=new JFrame();
  	JPanel p=new JPanel();
  	AWTCont(){
    	b1=new JButton("Count Up");
    	b2=new JButton("Count Down");
    	b3=new JButton("Reset");
		t1=new JTextField(15);
		t1.addActionListener(this);
		l1=new JLabel("Counter");
		p.setLayout(new java.awt.FlowLayout());
		p.add(l1);
		p.add(t1);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);	
		f.setLayout(new java.awt.FlowLayout());
    	f.setSize(550,120);
    	f.setTitle("AWT Counter");
    	f.setVisible(true);
		f.add(p);
  	}
  	public void actionPerformed(ActionEvent e){
    	try{	
     		final String x1=(t1.getText());
	   		if(e.getSource()==b1){
	  			int x=Integer.parseInt(t1.getText());
	 			int y=x+1;
	 			String s=String.valueOf(y);
	 			s.trim();
	 			t1.setText(s);
			}
			if(e.getSource()==b2){
	 			int x=Integer.parseInt(t1.getText());
	 			int y=x-1;
	 			String s=String.valueOf(y);
	 			s.trim();
	 			t1.setText(s);
			}
			if(e.getSource()==b3){
	 			t1.setText("");
			}
  		}
  		catch(Exception e1){
  			System.out.println(e1);
  		}
  	}
}
public class Counter{
	public static void main(String args[]){
   		new AWTCont();
  	}
}