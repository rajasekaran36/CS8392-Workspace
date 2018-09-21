import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

class MyFrame extends Frame implements MouseListener{
	public MyFrame() {
		//add(new MyCanvas());
		setSize(500, 500);
		// Adding Mouse Listener
		addMouseListener(this);
		setTitle("Mouse Listener Demo");
		setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseEntered");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased");
		
	}
	
}

public class Main {

	public static void main(String[] args) {
	    new MyFrame();
	}

}
