import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyFrame extends JFrame{
	JPanel pan;
	JLabel lab;
	JTextField tf;
	JButton b;
	JTextArea ta;
	public MyFrame() {
		
		pan = new JPanel();
		lab = new JLabel("Name");
		tf = new JTextField(10);
		ta = new JTextArea(10,10);
		b = new JButton("Click Me");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				lab.setText("Hello");
				
			}
		});
		
		pan.add(lab);
		pan.add(ta);
		pan.add(b);
		
		add(pan);
		setSize(500,500);
		setTitle("Swing Demo");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
public class Main {

	public static void main(String[] args) {
		new MyFrame();
	}

}
