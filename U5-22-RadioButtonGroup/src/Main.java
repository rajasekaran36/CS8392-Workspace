import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class MyFrame extends JFrame{
	JPanel checkboxpan;
	JRadioButton rb1;
	JRadioButton rb2;
	JRadioButton rb3;
	ButtonGroup bg;
	JTextArea output;
	ArrayList<String> itemsSelected;
	public MyFrame() {
		itemsSelected = new ArrayList<String>();
		setLayout(new BorderLayout());
		checkboxpan = new JPanel();
		bg = new ButtonGroup();
		output = new JTextArea("OUTPUT");
		checkboxpan.setLayout(new GridLayout(0, 1));
		rb1 = new JRadioButton("Apple");
		rb2 = new JRadioButton("Mango");
		rb3 = new JRadioButton("Orange");
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		checkboxpan.add(rb1);
		checkboxpan.add(rb2);
		checkboxpan.add(rb3);
		rb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(rb1.isSelected())
					itemsSelected.add(rb1.getText());
				else
					itemsSelected.remove(rb1.getText());
				output.setText(itemsSelected.toString());
			}
		});
		rb2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(rb2.isSelected())
					itemsSelected.add(rb2.getText());
				else
					itemsSelected.remove(rb2.getText());
				output.setText(itemsSelected.toString());
			}
		});
		rb3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(rb3.isSelected())
					itemsSelected.add(rb3.getText());
				else
					itemsSelected.remove(rb3.getText());
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
