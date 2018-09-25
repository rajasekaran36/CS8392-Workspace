import java.awt.*;
import java.awt.geom.*;
class MyCanvas extends Canvas implements Runnable{
	int x = 0;
	int y = 0;
	int time;
	public MyCanvas(int time) {
		this.time = time;
		new Thread(this).start();
	}
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		Ellipse2D.Float e2d = new Ellipse2D.Float(x, y, 25, 25);
		g2d.setColor(Color.BLUE);
		g2d.fill(e2d);
		g2d.draw(e2d);
		
	}
	@Override
	public void run() {
		for(int i=1;i<=20;i++) {
			try {
				Thread.sleep(time);
				x = x + 10;
				y = y + 10;
				repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyFrame extends Frame{
	public MyFrame() {
		add(new MyCanvas(300));
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
