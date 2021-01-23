import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class BackgroundTest extends Applet implements ActionListener{
/**
This Program is to set background of text area in applet window on our wish.
@since 2020-04-08
@author aumrudh
*/
  	Button[] colors;
  	TextArea ta;
  	Panel bp,pp;
  	public void init(){
  		Frame title = (Frame)this.getParent().getParent();
    	title.setTitle("Background Set");
    	bp=new Panel();
		colors=new Button[3];
		colors[0]=new Button("Red");
		colors[1]=new Button("Green");
		colors[2]=new Button("Blue");
		for(int i=0;i<3;i++){
	  		colors[i].addActionListener(this);
	  		bp.add(colors[i]);
		}		
		ta=new TextArea(7,25);
		ta.setFont(new Font("Courier New",Font.BOLD,25));	
		pp=new Panel();
		pp.setLayout(new java.awt.BorderLayout());
		pp.add(ta,BorderLayout.CENTER);
		pp.add(bp,BorderLayout.SOUTH);
		add(pp);
 	}
 	public void paint(Graphics g){
    	showStatus("Aumrudh");
    }
	public void actionPerformed(ActionEvent e){
	 	if(e.getSource()==colors[0]){
	    	ta.setBackground(Color.red);
	  	}
	 	if(e.getSource()==colors[1]){
	   	 	ta.setBackground(Color.blue);
	  	}
	 	if(e.getSource()==colors[2]){
	    	ta.setBackground(Color.green);
	  	}
	}
 }

/*<applet code="BackgroundTest.class" width="1000" height="500">
</applet>*/