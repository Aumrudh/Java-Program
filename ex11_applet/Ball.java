import java.awt.*;
import java.applet.*;
public class Ball extends Applet{
	int x1=0,y1=130,w=50,h=50;
	int x2=125,y2=0;
	public void paint(Graphics g){
			int i;
			g.setColor(Color.CYAN);
			g.fillOval(x1,y1,w,h);
			g.setColor(Color.RED);
			g.fillOval(x2,y2,w,h);
			x1=y2+=10;
			try{
				Thread.sleep(200);
			}
			catch(Exception e){
				System.out.println(e);
			}  
	 	 	repaint();			   	    
	}
}
	/*<applet code="Ball.class" width="300" height="300">
	</applet>
	*/