import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

class MyCanvas extends Canvas{
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		Rectangle2D.Float r2d = new Rectangle2D.Float(100, 100, 100.67F, 100.657F);
		g2d.draw(r2d);
		
	}
}

class MyFrame extends Frame{
	public MyFrame() {
		add(new MyCanvas());
		System.out.println("Canvas Added");
		setSize(500, 500);
		setTitle("Frame Demo");
		setVisible(true);
		
	}
}

public class Main {

	public static void main(String[] args) {
	    new MyFrame();
	}

}
