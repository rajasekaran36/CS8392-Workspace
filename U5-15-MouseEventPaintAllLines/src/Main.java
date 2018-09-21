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
import java.util.ArrayList;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

class MyCanvas extends Canvas {
	Point2D.Float source;
	Point2D.Float destination;
	ArrayList<Line2D.Float> lines;
	boolean isClicked = false;
	public MyCanvas() {
		lines = new ArrayList<Line2D.Float>();
		source = new Point2D.Float(0F, 0F);
		destination = new Point2D.Float(0F, 0F);
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				if(isClicked) {
					destination = new Point2D.Float(x, y);
					lines.add(new Line2D.Float(source, destination));
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
		for(Line2D.Float aline:lines)
			g2d.draw(aline);
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
