import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class BallButton extends Applet implements ActionListener,KeyListener{
	Button[] b=new Button[4];
	public int x1=830,y1=130,w=90,h=90;
	int i;
	String str,str1,str2;
	public void init(){
		Frame title = (Frame)this.getParent().getParent();
    	title.setTitle("Move a ball");
    	setLayout(null);
		b[0]=new Button("UP");
		b[0].setBounds(800,650,150,60);
		b[1]=new Button("LEFT");
		b[1].setBounds(700,750,150,60);
		b[2]=new Button("RIGHT");
		b[2].setBounds(900,750,150,60);
		b[3]=new Button("DOWN");
		b[3].setBounds(800,850,150,60);
		 
		/*for(i=0;i<4;i++){
			add(b[i]);
			b[i].addActionListener(this);
		}*/
		addKeyListener(this);
		setBackground(Color.CYAN);
	}
    public void paint(Graphics g){
    	showStatus("Aumrudh");
        g.setColor(Color.RED);
        g.fillOval(x1,y1,w,h);
    }
	public  void actionPerformed(ActionEvent e){
		str=e.getActionCommand();
		if(str=="UP"){
			y1=y1-10;
			repaint();
		}
		else if(str=="DOWN"){
			y1=y1+10;
			repaint();
		}
		else if(str=="LEFT"){
			x1=x1-10;
			repaint();
		}
		else if(str=="RIGHT"){
			x1=x1+10;
			repaint();
		}	 
	}
public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP){ 
        y1=y1-10;
      	repaint();
    }
    else if( e.getKeyCode() == KeyEvent.VK_LEFT) {
      x1=x1-10;
      repaint();
    }
    else if (e.getKeyCode() == KeyEvent.VK_DOWN ) {
        y1=y1+10;
      	repaint();;
    }
    else if( e.getKeyCode() == KeyEvent.VK_RIGHT) {
      x1=x1+10;
      repaint();
    }
   
	} 	public void keyTyped ( KeyEvent e ){}
	public void keyReleased(KeyEvent e){
  	    	repaint();
 	    }
	
}
 
/*
<applet code="BallButton.class" width="5000" height="1000">
</applet>
*/