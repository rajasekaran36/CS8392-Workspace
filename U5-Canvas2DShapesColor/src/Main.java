import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

class MyCanvas extends Canvas{
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		Line2D.Float l2d = new Line2D.Float(50F, 50F, 400F, 400F);
		Rectangle2D.Float r2d = new Rectangle2D.Float(100, 100, 100.67F, 100.657F);
		Arc2D.Float a2d = new Arc2D.Float(100F, 100F, 300F, 300F, 0F, 90F, Arc2D.OPEN);
		Ellipse2D.Float e2d = new Ellipse2D.Float(300F, 300F, 100F, 100F);
		g2d.setColor(Color.BLUE);
		g2d.draw(l2d);
		g2d.setColor(Color.RED);
		g2d.draw(r2d);
		g2d.setColor(Color.GREEN);
		g2d.draw(a2d);
		g2d.setColor(Color.CYAN);
		g2d.draw(e2d);
		
	}
}

class MyFrame extends Frame{
	public MyFrame() {
		add(new MyCanvas());
		System.out.println("Canvas Added");
		setSize(500, 500);
		setTitle("2D Shapes");
		setVisible(true);
		
	}
}

public class Main {

	public static void main(String[] args) {
	    new MyFrame();
	}

}
