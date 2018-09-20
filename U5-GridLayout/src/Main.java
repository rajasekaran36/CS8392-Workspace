import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyJFame extends JFrame{
	JPanel pan;
	
	public MyJFame() {
		
		pan = new JPanel();
		pan.setLayout(new GridLayout(4, 4));
		pan.add(new JButton("1"));
		pan.add(new JButton("2"));
		pan.add(new JButton("3"));
		pan.add(new JButton("+"));
		pan.add(new JButton("4"));
		pan.add(new JButton("5"));
		pan.add(new JButton("6"));
		pan.add(new JButton("-"));
		pan.add(new JButton("7"));
		pan.add(new JButton("8"));
		pan.add(new JButton("9"));
		pan.add(new JButton("*"));
		pan.add(new JButton("."));
		pan.add(new JButton("0"));
		pan.add(new JButton("="));
		pan.add(new JButton("/"));
		
		
		add(pan);
		setVisible(true);
		setSize(300, 300);
		setTitle("Swing Demo");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}

public class Main {
	public static void main(String[] args) {
		new MyJFame();
	}
}
