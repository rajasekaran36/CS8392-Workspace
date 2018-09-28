import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrame extends Frame{
	Panel p;
	Label l;
	TextField tf;
	Button b;
	public MyFrame() {
		p = new Panel();
		l = new Label("Name");
		tf = new TextField(10);
		b = new Button("Click Me");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String data = tf.getText();
				l.setText(data);
			}
		});
		p.add(l);
		p.add(tf);
		p.add(b);
		
		add(p);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		}
		);
		setSize(300, 300);
		setTitle("Hello AWT");
		setVisible(true);
	}	
}

public class Main {

	public static void main(String[] args) {
		new MyFrame();
	}

}
