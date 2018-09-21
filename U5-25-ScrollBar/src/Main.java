import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class MyFrame extends JFrame{
	JPanel scrollpan;
	JScrollBar sbar;
	JTextArea output;
	public MyFrame() {
		sbar = new JScrollBar();
		sbar.setBounds(100,100, 50,100);  
		sbar.addAdjustmentListener(new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent ae) {
				output.setText(String.valueOf(sbar.getValue()));
			}
		});
		setLayout(new BorderLayout());
		scrollpan = new JPanel();
		output = new JTextArea("OUTPUT");
		scrollpan.setLayout(new GridLayout(0, 1));
		scrollpan.add(sbar);
		add(scrollpan,BorderLayout.NORTH);
		add(output,BorderLayout.CENTER);
		setSize(300,300);
		setVisible(true);
	}
}
public class Main {
	public static void main(String[] args) {
		new MyFrame();
	}
}
