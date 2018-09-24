import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
				if(SwingUtilities.isLeftMouseButton(me)) {
					x = x + 5;
					y = y + 5;
					repaint();
				}
				else if(SwingUtilities.isRightMouseButton(me)) {
					x = x - 5;
					y = y - 5;
					repaint();
				}
			}
		});
	}
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		Rectangle2D.Float r2d = new Rectangle2D.Float(100, 100, x, y);
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
