import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Atm extends JFrame implements ActionListener{
    JPasswordField pf;
    JButton[] b=new JButton[12];
    JFrame f=new JFrame();
    JLabel l=new JLabel();
    Atm(){
      JPanel p=new JPanel();
      JPanel p1=new JPanel();
      JPanel p2=new JPanel();
      p.setLayout(new java.awt.FlowLayout());
      p1.setLayout(new java.awt.GridLayout(4,3));
      p2.setLayout(new java.awt.BorderLayout());     
      pf=new JPasswordField(30);
      p.add(pf);
      b[0]=new JButton("1");
      b[1]=new JButton("2");
      b[2]=new JButton("3");
      b[3]=new JButton("4");
      b[4]=new JButton("5");
      b[5]=new JButton("6");
      b[6]=new JButton("7");
      b[7]=new JButton("8");
      b[8]=new JButton("9");
      b[9]=new JButton("CLEAR");
      b[10]=new JButton("0");
      b[11]=new JButton("ENTER");
      for(int i=0;i<12;i++){
          b[i].addActionListener(this);
	        p1.add(b[i]);
      }
      p2.add(p,java.awt.BorderLayout.NORTH);
      p2.add(p1,java.awt.BorderLayout.CENTER);
      f.add(p2);
	    f.setSize(400,400);
	    f.setLayout(new java.awt.FlowLayout());
	    f.setVisible(true);
	    f.setTitle("ATM");
    }
  public void actionPerformed(ActionEvent e){ 
      String str=e.getActionCommand();
      char ch=str.charAt(0);
      if (Character.isDigit(ch)){
		      pf.setText(pf.getText()+str);
	     }
      else if(str.equals("CLEAR")){
		    String s="";
		    pf.setText(s);
      }
	    else if(str.equals("ENTER")){
		    String s1=pf.getText();
		    String s2="2519";
	      if(s1.equals(s2)){
            JOptionPane.showMessageDialog(null, "Welcome");
		    }
		    else{
            JOptionPane.showMessageDialog(null, "Wrong Pin","Alert",JOptionPane.PLAIN_MESSAGE);
		    }	
      }
    }
  }
public class AtmEg{
   public static void main(String args[]){
      new Atm();
	 }
}