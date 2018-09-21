import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Applet implements ActionListener{
	Frame f;
	Button b;
	String data ="";
	public void init() {
		b = new Button("Hello");
		b.addActionListener(this);
		add(b);
		this.setSize(100,100);
		this.setVisible(true);
	}
	public void paint(Graphics g) {
		g.drawString(data, 100, 200);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		data = "Rajasekaran";
		repaint();
	}
}
