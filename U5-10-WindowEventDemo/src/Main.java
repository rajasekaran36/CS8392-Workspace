import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
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

class MyFrame extends Frame implements WindowListener{
	public MyFrame() {
		add(new MyCanvas());
		setSize(500, 500);
		// Adding Window Listener
		addWindowListener(this);
		setTitle("Frame Demo");
		setVisible(true);
		
	}
	
	//Window Listener Implementation
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		//Method the close the awt window 
		dispose();
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}
}

public class Main {

	public static void main(String[] args) {
	    new MyFrame();
	}

}
