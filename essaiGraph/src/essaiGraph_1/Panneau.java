package essaiGraph_1;
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class Panneau extends JPanel { 
	public void paintComponent(Graphics g){                
	    int x1 = this.getWidth()/4;
	    int y1 = this.getHeight()/4;                      
	    g.fillOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
	    g.drawString("Page 1 PJ !", 10, 20);
	  }             
}