import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyJFame extends JFrame{
	JPanel pan;
	public MyJFame() {
		
		pan = new JPanel();
		
		pan.setLayout(new GridLayout(3, 3));
		pan.add(new JButton("Button"));
		pan.add(new JButton("Button"));
		pan.add(new JButton("Button"));
		pan.add(new JButton("Button"));
		pan.add(new JButton("Button"));
		pan.add(new JButton("Button"));
		pan.add(new JButton("Button"));
		pan.add(new JButton("Button"));
		
		add(pan);
		setVisible(true);
		setSize(300, 300);
		setTitle("Swing Grid Bag Layout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}

public class Main {
	public static void main(String[] args) {
		new MyJFame();
	}
}
