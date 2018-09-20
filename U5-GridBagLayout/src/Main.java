import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyJFame extends JFrame{
	JPanel pan;
	GridBagLayout gbl;
	GridBagConstraints gbc;
	public MyJFame() {
		
		pan = new JPanel();
		gbl = new GridBagLayout();
		gbc = new GridBagConstraints();
		pan.setLayout(gbl);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		pan.add(new JButton("1"),gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;
		gbc.gridy = 0;
		pan.add(new JButton("2"),gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 20;
		gbc.gridx = 0;
		gbc.gridy = 1;
		pan.add(new JButton("3"),gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;
		gbc.gridy = 1;
		pan.add(new JButton("4"),gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		pan.add(new JButton("5"),gbc);
		
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
