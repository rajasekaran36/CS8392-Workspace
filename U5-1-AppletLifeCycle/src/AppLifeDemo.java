import java.applet.Applet;
import java.awt.Graphics;

public class AppLifeDemo extends Applet{
	public void init() {
		System.out.println("Init Called");
	}
	public void start() {
		System.out.println("Start Called");
	}
	public void stop() {
		System.out.println("Stop Called");
	}
	public void destroy() {
		System.out.println("Destroy Called");
	}
	public void paint(Graphics g) {
		System.out.println("Paint Called");
	}
}
