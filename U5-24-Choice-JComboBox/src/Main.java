import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JRadioButton;
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
	JPanel combopan;
	JComboBox<String> combo;
	JTextArea output;
	ArrayList<String> itemsSelected;
	public MyFrame() {
		
		String[] items = {"Apple", "Mango", "Orange"};
		combo = new JComboBox<String>(items);
		
		combo.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				output.setText(combo.getItemAt(combo.getSelectedIndex())+" Selected");
			}
		});
		itemsSelected = new ArrayList<String>();
		
		setLayout(new BorderLayout());
		combopan = new JPanel();
		output = new JTextArea("OUTPUT");
		combopan.setLayout(new GridLayout(0, 1));
		combopan.add(combo);
		add(combopan,BorderLayout.NORTH);
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
