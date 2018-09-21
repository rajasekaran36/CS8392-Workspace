import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

class MyCanvas extends Canvas{
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		Toolkit tkit = Toolkit.getDefaultToolkit();
		Image img = tkit.getImage("E:/CS8392-Workspace/U5-CanvasImages/sun-rise.jpg");
		g2d.drawImage(img,0,0,this);
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
