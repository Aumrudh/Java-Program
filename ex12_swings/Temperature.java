import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class SwingTemperatureConverter implements ActionListener{
  	JLabel l1,l2;
  	JTextField t1,t2;
  	JFrame f=new JFrame();
  	JPanel p=new JPanel();
  	JPanel p1=new JPanel();
  	SwingTemperatureConverter(){
  		l1=new JLabel("Celsius:");
  		l2=new JLabel("Fahrenheit:");
  		t1=new JTextField(15);
  		t2=new JTextField(15);
  		p.add(l1);
  		p.add(t1);  
  		p1.add(l2);
  		p1.add(t2);  
  		f.setLayout(new java.awt.FlowLayout());
 	 	f.setSize(400,120);
 	 	f.setTitle("Temperature Converter");
 	 	f.setVisible(true);  
 	 	f.add(p);
  		f.add(p1);  
  		t1.addActionListener(this);
  		t2.addActionListener(this);  
  	} 
    public void actionPerformed(ActionEvent e){
  		if(e.getSource()==t1){
			float cel=Float.parseFloat(t1.getText());
        	float fah=((cel*(1.8f))+32);
        	t2.setText(" "+fah);  
   	 	}
   	 	if(e.getSource()==t2){
   	 		float fah=Float.parseFloat(t2.getText());
        	float cel=((fah - 32)/1.8f);
        	t1.setText(" "+cel);
        }     
  	}
}
public class Temperature{
   public static void main(String args[]){
   		new SwingTemperatureConverter();
   }
}  
  