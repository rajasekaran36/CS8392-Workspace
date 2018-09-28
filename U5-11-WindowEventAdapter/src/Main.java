import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.Rectangle2D;

class MyCanvas extends Canvas{
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		Rectangle2D.Float r2d = new Rectangle2D.Float(100, 100, 100.67F, 100.657F);
		g2d.draw(r2d);
		
	}
}
class MyWindowAdapter extends WindowAdapter{
	
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		//Method the close the awt window 
		e.getWindow().dispose();
	}
}
class MyFrame extends Frame{
	MyWindowAdapter myadapter;
	public MyFrame() {
		add(new MyCanvas());
		setSize(500, 500);
		myadapter = new MyWindowAdapter();
		// Adding Window Listener
		addWindowListener(myadapter);
		setTitle("Frame Demo");
		setVisible(true);
		
	}
	
}

public class Main {

	public static void main(String[] args) {
	    new MyFrame();
	}

}