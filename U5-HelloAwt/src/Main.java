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
	Label output;
	TextField tf;
	TextField tf2;
	Button b;
	Button b1;
	Button sin;
	public MyFrame() {
		p = new Panel();
		l = new Label("Numbers");
		tf = new TextField(5);
		tf2 = new TextField(5);
		b = new Button("+");
		b1 = new Button("-");
		sin = new Button("sin");
		output = new Label("out");
		
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String data1 = tf.getText();
				String data2 = tf2.getText();
				int idata1 = Integer.parseInt(data1);
				int idata2 = Integer.parseInt(data2);
				
				int outdata = idata1 + idata2;
				output.setText(String.valueOf(outdata));
			}
		});
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String data1 = tf.getText();
				String data2 = tf2.getText();
				int idata1 = Integer.parseInt(data1);
				int idata2 = Integer.parseInt(data2);
				
				int outdata = idata1 - idata2;
				output.setText(String.valueOf(outdata));
			}
		});
		
		sin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String data = tf.getText();
				int idata = Integer.parseInt(data);
				double sinvalue = Math.sin(idata);
				output.setText(String.valueOf(sinvalue));
				
			}
		});
		
		p.add(l);
		p.add(tf);
		p.add(tf2);
		p.add(b);
		p.add(b1);
		p.add(sin);
		p.add(output);
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
