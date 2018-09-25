import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

class MyCanvas extends Canvas{
	public void paint(Graphics g) {
		g.drawString("HelloWorld", 100, 100);
	}
}

class MyFrame extends Frame{
	public MyFrame() {
		add(new MyCanvas());
		setSize(500, 500);
		setTitle("Frame With String");
		setVisible(true);
		
	}
}

public class Main {

	public static void main(String[] args) {
	    new MyFrame();
	}

}
