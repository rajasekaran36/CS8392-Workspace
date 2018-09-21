import java.awt.*;
import java.awt.geom.Rectangle2D;
class MyCanvas extends Canvas{
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		Rectangle2D.Float r2d = new Rectangle2D.Float(100, 100, 200, 200);
		g2d.draw(r2d);
		//g.drawString("Hello", 50, 50);
		//g.drawRect(100, 100,100, 70);
		//g.drawOval(100, 100, 200, 100);
		//g.drawLine(100, 100, 200, 200);
		//g.drawArc(100,100,200,200,0,90);
		//g.fillArc(10, 10, 100, 100, 0, 90);
	}
}

class MyFrame extends Frame{
	public MyFrame() {
		add(new MyCanvas());
		setSize(500, 500);
		setTitle("MyFrame");
		setVisible(true);
	}
}

public class Main {

	public static void main(String[] args) {
		new MyFrame();
	}

}
