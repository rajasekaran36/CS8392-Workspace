import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyJFame extends JFrame{
	JPanel pan;
	public MyJFame() {
		
		pan = new JPanel();
		pan.setLayout(new BorderLayout());
		pan.add(new JButton("EAST"),BorderLayout.EAST);
		pan.add(new JButton("WEST"),BorderLayout.WEST);
		pan.add(new JButton("NORTH"),BorderLayout.NORTH);
		pan.add(new JButton("SOUTH"),BorderLayout.SOUTH);
		pan.add(new JButton("CENTER"),BorderLayout.CENTER);
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
