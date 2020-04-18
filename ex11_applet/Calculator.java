import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Calculator extends Applet implements ActionListener{
  String msg=" ";
  TextField t1,t2,t3;
  Button b1,b2,b3,b4,b5,b6;
  Label l1,l2,l3;
  public void init()  {
    l1=new Label("First Number");
	add(l1);
	t1=new TextField(15);
	add(t1);
	l2=new Label("Second Number");
	add(l2);
	t2=new TextField(15);
	add(t2);
	l3=new Label("Result");
	add(l3);
	t3=new TextField(15);
	add(t3);
	b1=new Button("Add");
	add(b1);
	b1.addActionListener(this);
	b2=new Button("Sub");
	add(b2);
	b2.addActionListener(this);
	b3=new Button("Multi");
	add(b3);
	b3.addActionListener(this);
	b4=new Button("Div");
	add(b4);
	b4.addActionListener(this);
	b5=new Button("Square");
	add(b5);
	b5.addActionListener(this);
	b6=new Button("Squareroot");
	add(b6);
	b6.addActionListener(this);	
	}
public void actionPerformed(ActionEvent e){
   if(e.getSource()==b1){
   		int x=Integer.parseInt(t1.getText());
   		int y=Integer.parseInt(t2.getText());
  		int sum=x+y;
   		t3.setText(" "+sum);
   }
   if(e.getSource()==b2){
   		int x=Integer.parseInt(t1.getText());
   		int y=Integer.parseInt(t2.getText());
  		int diff=x-y;
  		t3.setText(" "+diff);
   }
   if(e.getSource()==b3){
   		int x=Integer.parseInt(t1.getText());
   		int y=Integer.parseInt(t2.getText());
   		int pdt=x*y;
   		t3.setText(" "+pdt);
   }
   if(e.getSource()==b4){
   		int x=Integer.parseInt(t1.getText());
   		int y=Integer.parseInt(t2.getText());
   		int quo=x/y;
   		t3.setText(" "+quo);
   }
   if(e.getSource()==b5){
   		int x=Integer.parseInt(t1.getText());
   		int squ=x*x;
   		t3.setText(" "+squ);
   }
   if(e.getSource()==b6){
   		double x=Integer.parseInt(t1.getText());
   		double sr=Math.sqrt(x);
   		t3.setText(" "+sr);
   }
   showStatus("Calculator");
   repaint();
   }
}
 /*<applet code="Calculator.class" width="800" height="500">
  </applet>*/     
	