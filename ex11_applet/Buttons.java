import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Buttons extends Applet{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
 	Panel p1=new Panel();
 	Panel p2=new Panel();
 	Panel p3=new Panel();
 	Panel p4=new Panel();
 	Panel p5=new Panel(); 
 	public void init(){
 		b1=new Button("A");
 		b2=new Button("D");
 		b3=new Button("C");
 		b4=new Button("B");
 		b5=new Button("E");
 		p1.setLayout(new java.awt.BorderLayout());
 		p1.add(b1,java.awt.BorderLayout.NORTH);
 		p1.add(b2,java.awt.BorderLayout.EAST);
 		p1.add(b3,java.awt.BorderLayout.CENTER);
 		p1.add(b4,java.awt.BorderLayout.WEST);
 		p1.add(b5,java.awt.BorderLayout.SOUTH); 
 		b6=new Button("F");
 		b7=new Button("G");
 		b8=new Button("H");
 		b9=new Button("I");
 		b10=new Button("J");
 		b11=new Button("K"); 
 		p3.setLayout(new java.awt.GridLayout(3,2));
 		p3.add(b6);
 		p3.add(b7);
 		p3.add(b8);
 		p3.add(b9);
 		p3.add(b10);
 		p3.add(b11); 
 		b12=new Button("L");
 		b13=new Button("M");
 		b14=new Button("N");
 		b15=new Button("O");
 		b16=new Button("P"); 
 		p2.setLayout(new java.awt.GridLayout(5,1));
 		p2.add(b12);
 		p2.add(b13);
 		p2.add(b14);
 		p2.add(b15);
 		p2.add(b16); 
  		p4.setLayout(new java.awt.GridLayout(1,2));
  		p4.add(p1);
  		p4.add(p2);  
  		p5.setLayout(new java.awt.GridLayout(2,1));
  		p5.add(p4);
  		p5.add(p3);   
  		add(p5);
 	}
 }
 /*<applet code="Buttons.class" width="400" height="400">
  </applet>*/    
 