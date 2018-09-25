import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.SwingUtilities;

class MyCanvas extends Canvas{
	int x=10;
	int y=20;
	public MyCanvas() {
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent me) {
				// TODO Auto-generated method stub
				x = me.getX();
				y = me.getY();
				int del_x = x - 100;
				int del_y = y - 100;
				double inRads = Math.atan2(del_x, del_y);
				
				if (inRads < 0)
			        inRads = Math.abs(inRads);
			    else
			        inRads = 2 * Math.PI - inRads;
				
				x = (int) (50*Math.cos(Math.toDegrees(inRads)));
				y = (int) (50*Math.sin(Math.toDegrees(inRads)));
				repaint();
			}
		});
	}
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		Line2D.Float r2d = new Line2D.Float(100,100,x,y);
		g2d.draw(r2d);
		
	}
}

class MyFrame extends Frame{
	public MyFrame() {
		add(new MyCanvas());
		
		setSize(500, 500);
		setTitle("Grow and Shrink");
		setVisible(true);
		
	}
}

public class Main {

	public static void main(String[] args) {
	    new MyFrame();
	}

}
