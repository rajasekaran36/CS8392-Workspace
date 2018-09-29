import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.*;

class MyCanvas extends Canvas implements Runnable{
	double x = 300;
	double y = 300;
	Point2D.Double center = new Point2D.Double(200, 200);
	Point2D.Double edge;
	
	public MyCanvas() {
		new Thread(this).start();
	}
	
	public void paint(Graphics g) {
		edge = new Point2D.Double(x,y);
		Graphics2D g2d = (Graphics2D)g;
		Ellipse2D.Float ele = new Ellipse2D.Float(100, 100, 200, 200);
		Line2D.Float l = new Line2D.Float(center,edge);
		g2d.draw(l);
		g2d.draw(ele);
		
	}
	public void run() {
		for(int i=0;i<10;i++) {
			//x = x + Math.cos(Math.PI*0.5);
			y = y + Math.sin(Math.PI*0.5);
			repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyFrame extends Frame{
	public MyFrame() {
		add(new MyCanvas());
		setSize(500, 500);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setTitle("Analog Clock");
		setVisible(true);
		
	}
	
}
public class Main {

	public static void main(String[] args) {
	    new MyFrame();
	}

}