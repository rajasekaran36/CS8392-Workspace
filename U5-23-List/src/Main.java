import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class MyFrame extends JFrame{
	JPanel listpan;
	DefaultListModel<String> mylist;
	JList<String> listDisplay;
	JTextArea output;
	ArrayList<String> itemsSelected;
	public MyFrame() {
		
		mylist = new DefaultListModel<String>();
		mylist.addElement("Apple");
		mylist.addElement("Mango");
		mylist.addElement("Orange");
		
		listDisplay = new JList<String>(mylist);
		itemsSelected = new ArrayList<String>();
		listDisplay.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent lse) {
				output.setText(listDisplay.getSelectedValue()+" Selected");
			}
		});
		setLayout(new BorderLayout());
		listpan = new JPanel();
		output = new JTextArea("OUTPUT");
		listpan.setLayout(new GridLayout(0, 1));
		listpan.add(listDisplay);
		add(listpan,BorderLayout.NORTH);
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
