import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
class MyCanvas extends Canvas{
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		 Font plainFont = new Font("Serif", Font.PLAIN, 24);        
	      g2d.setFont(plainFont);
	      g2d.drawString("Object Oriented Programming", 50, 70); 
	      Font italicFont = new Font("Serif", Font.ITALIC, 24);        
	      g2d.setFont(italicFont);
	      g2d.drawString("Object Oriented Programming", 50, 120); 
	      Font boldFont = new Font("Serif", Font.BOLD, 24);        
	      g2d.setFont(boldFont);
	      g2d.drawString("Object Oriented Programming", 50, 170); 
	      Font boldItalicFont = new Font("Serif", Font.BOLD+Font.ITALIC, 24);        
	      g2d.setFont(boldItalicFont);
	      g2d.drawString("Object Oriented Programming", 50, 220); 
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
