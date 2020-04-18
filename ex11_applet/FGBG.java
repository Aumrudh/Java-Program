import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class FGBG extends Applet implements ActionListener,ItemListener{
  Button[] colors;
  Checkbox fg,bg;
  TextArea wa;
  CheckboxGroup cbg;
  Panel bp,cp,pp;
  String c;
  public void init(){
    bp=new Panel();
  	bp.setLayout(new java.awt.GridLayout(3,3));
	colors=new Button[9];
	colors[0]=new Button("Red");
	colors[1]=new Button("Blue");
	colors[2]=new Button("Green");
	colors[3]=new Button("Yellow");
	colors[4]=new Button("Cyan");
	colors[5]=new Button("Black");
	colors[6]=new Button("Orange");
	colors[7]=new Button("Pink");
	colors[8]=new Button("Grey");	
	for(int i=0;i<9;i++){
	  colors[i].addActionListener(this);
	  bp.add(colors[i]);
	}	
	cp=new Panel();
	cp.setLayout(new FlowLayout());
	cbg=new CheckboxGroup();	
	fg=new Checkbox("Foreground",cbg,true);
	bg=new Checkbox("Background",cbg,false);
	fg.addItemListener(this);
	bg.addItemListener(this);
	cp.add(fg);
	cp.add(bg);
	wa=new TextArea(8,40);
	wa.setFont(new Font("Garamond",Font.BOLD,20));	
	pp=new Panel();
	pp.setLayout(new java.awt.BorderLayout());
	pp.add(wa,BorderLayout.CENTER);
	pp.add(cp,BorderLayout.EAST);
	pp.add(bp,BorderLayout.SOUTH);
	add(pp);
   }
    public void itemStateChanged(ItemEvent e){}
	public void actionPerformed(ActionEvent e){
	  c=e.getActionCommand();
	  if(fg.getState()==true){
	     wa.setForeground(getColor());
	  }
	  if(bg.getState()==true){
	    wa.setBackground(getColor());
	  }
	}
	public Color getColor(){
	  Color mycolor=null;
	  if(c.equals("Red")){
	   mycolor=Color.red;
	  }
	  if(c.equals("Blue")){
	   mycolor=Color.blue;
	  }
	  if(c.equals("Cyan")){
	   mycolor=Color.cyan;
	  }
	  if(c.equals("Pink")){
	   mycolor=Color.pink;
	  }
	  if(c.equals("Orange")){
	   mycolor=Color.orange;
	  }
	  if(c.equals("Black")){
	   mycolor=Color.black;
	  }
	  if(c.equals("Yellow")){
	   mycolor=Color.yellow;
	  }
	  if(c.equals("Green")){
	   mycolor=Color.green;
	  }
	  if(c.equals("Grey")){
	   mycolor=Color.gray;
	  }
	  return mycolor;
	}
 }

/*<applet code="FGBG.class" width="1000" height="1000">
</applet>*/