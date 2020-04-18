import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Smile extends Applet
{
  public void paint(Graphics g)
  {
   // g.drawString("Now your Turn...!!",50,50);
	setBackground(Color.WHITE);
	//setForeground(Color.GREEN);
	g.drawRect(60,120,55,100);
	g.drawOval(60,120,55,100);
	g.drawOval(500,120,150,120);
	g.drawOval(550,150,10,20);
	g.drawOval(600,150,10,20);
	g.drawOval(490,170,10,20);
	g.drawOval(650,170,10,20);
	g.drawOval(575,170,8,30);
	g.drawArc(550,190,60,30,160,200);
//	g.drawString("How to program this...?????",50,300);
	}
	}
	/*<applet code="Smile.class" width="800" height="600">
  </applet>*/    