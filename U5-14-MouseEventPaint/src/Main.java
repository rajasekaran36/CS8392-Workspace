import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

class MyCanvas extends Canvas {
	Point2D.Float source;
	Point2D.Float destination;
	boolean isClicked = false;
	public MyCanvas() {
		source = new Point2D.Float(0F, 0F);
		destination = new Point2D.Float(0F, 0F);
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				if(isClicked) {
					destination = new Point2D.Float(x, y);
					repaint();
					isClicked = false;
				}
				else {
					source = new Point2D.Float(x, y);
					isClicked = true;
				}
			}
		});
	}
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		Line2D.Float l2d = new Line2D.Float(source, destination);
		g2d.draw(l2d);
	}
}

class MyFrame extends Frame{
	public MyFrame() {
		add(new MyCanvas());
		setSize(500, 500);
		setTitle("Mouse Listener Demo");
		setVisible(true);
		
	}
	
}

public class Main {

	public static void main(String[] args) {
	    new MyFrame();
	}

}
