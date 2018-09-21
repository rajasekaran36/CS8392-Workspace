import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class MyFrame extends JFrame{
	JPanel checkboxpan;
	JCheckBox cb1;
	JCheckBox cb2;
	JCheckBox cb3;
	JTextArea output;
	ArrayList<String> itemsSelected;
	public MyFrame() {
		itemsSelected = new ArrayList<String>();
		setLayout(new BorderLayout());
		checkboxpan = new JPanel();
		output = new JTextArea("OUTPUT");
		checkboxpan.setLayout(new GridLayout(0, 1));
		cb1 = new JCheckBox("Apple");
		cb2 = new JCheckBox("Mango");
		cb3 = new JCheckBox("Orange");
		checkboxpan.add(cb1);
		checkboxpan.add(cb2);
		checkboxpan.add(cb3);
		cb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(cb1.isSelected())
					itemsSelected.add(cb1.getText());
				else
					itemsSelected.remove(cb1.getText());
				output.setText(itemsSelected.toString());
			}
		});
		cb2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(cb2.isSelected())
					itemsSelected.add(cb2.getText());
				else
					itemsSelected.remove(cb2.getText());
				output.setText(itemsSelected.toString());
			}
		});
		cb3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(cb3.isSelected())
					itemsSelected.add(cb3.getText());
				else
					itemsSelected.remove(cb3.getText());
				output.setText(itemsSelected.toString());
			}
		});
		add(checkboxpan,BorderLayout.NORTH);
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
