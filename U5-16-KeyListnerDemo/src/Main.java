import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrame extends Frame implements ActionListener,KeyListener{
	Panel pan;
	Label lname;
	Button click;
	TextField name;
	Label output;
	public MyFrame() {
		lname = new Label("User Name");
		name = new TextField(10);
		click = new Button("Click");
		output = new Label();
		click.addActionListener(this);
		name.addKeyListener(this);
		pan = new Panel();
		pan.add(lname);
		pan.add(name);
		pan.add(click);
		pan.add(output);
		add(pan);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setSize(500, 500);
		setTitle("Greet User");
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String uname = name.getText();
		output.setText("Hello "+uname+"!!!");
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("key Pressed");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("key Released");
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("key Typed");
	}
}

public class Main {

	public static void main(String[] args) {
		new MyFrame();
	}

}