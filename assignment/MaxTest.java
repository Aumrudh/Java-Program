import java.util.Scanner;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class MaxTest extends Applet implements ActionListener{
/**
This Program find the maximum of three numbers whose input is got from html file.The Maximum of three number is set in the textbox.
@since 2020-04-08
@author aumrudh
*/
  TextField t1,t2,t3,t4;
  Label l1,l2,l3,l4;
  Button b1,b2;
  public void init()  {
  	Frame title = (Frame)this.getParent().getParent();
    title.setTitle("Maximum of Three Numbers");
    l1=new Label("First No.");	
    add(l1);
	t1=new TextField(10);
	add(t1);	
	l2=new Label("Second No.");
	add(l2);	
	t2=new TextField(10);	
	add(t2);
	l3=new Label("Third No.");
	add(l3);	
	t3=new TextField(10);
	add(t3);
	l4=new Label("Maximum No.");
	add(l4);	
	t4=new TextField(10);	
	add(t4);
	b1=new Button("Set Values");	
	b2=new Button("Find Maximum");
	add(b1);
	add(b2);
    b1.addActionListener(this);
    b2.addActionListener(this);
	//setBackground(new Color(0,0,0));
  }
  public void paint(Graphics g){
    	showStatus("Aumrudh");
    }
  public void actionPerformed(ActionEvent e)  {
     if(e.getSource()==b1){
	   try{
	     	Scanner ip=new Scanner(new File("maxnos.html"));
	    	int a=ip.nextInt();
		 	int b=ip.nextInt();
		 	int c=ip.nextInt();
		 	t1.setText(" "+a);
		 	t2.setText(" "+b);
		 	t3.setText(" "+c);
		}
	   catch(Exception ee){
	   	System.out.println("Invalid File\n"+ee);
	   }
	  }
	  if(e.getSource()==b2){
	   try{
	     Scanner ip=new Scanner(new File("maxnos.html"));
	     int a=ip.nextInt();
		 int b=ip.nextInt();
		 int c=ip.nextInt();
		 if(a>b && a>c){
			t4.setText(" "+a);
		 }
		 else if(b>a && b>c){
			t4.setText(" "+b);
		 }
		 else{
		   t4.setText(" "+c);
		 }
	   }
	   catch(Exception ee){
	   	System.out.println("Invalid File"+ee);
	   }
	  }
   }

}
/*<applet code="MaxTest.class" width="1000" height="50">
  </applet>*/ 