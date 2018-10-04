import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class MyFrame extends JFrame{
	
	JMenuBar mb;
	JMenu m,sub;
	JMenuItem mi1,mi2,mi3,mi4,smi1,smi2;
	
	JTextArea output;
	JPanel scrollpan;
	public MyFrame() {
		
		mi1 = new JMenuItem("Apple");
		mi2 = new JMenuItem("Mango");
		mi3 = new JMenuItem("Orange");
		smi1 = new JMenuItem("Tomato");
		smi2 = new JMenuItem("Potatos");
		
		m = new JMenu("Fruits");
		sub = new JMenu("Vegetables");
		
		sub.add(smi1);
		sub.add(smi2);
		
		m.add(mi1);
		m.add(mi2);
		m.add(mi3);
		m.add(sub);
		
		mi1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent al) {
				output.setText("Apple Selected");
			}
		});
		
		mb = new JMenuBar();
		
		mb.add(m);
		
		setJMenuBar(mb);
		setLayout(new BorderLayout());
		scrollpan = new JPanel();
		output = new JTextArea("OUTPUT");
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
