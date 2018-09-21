import javax.swing.*;
class MyFrame extends JFrame{
	String name;
	
	public MyFrame() {
		name = JOptionPane.showInputDialog("Enter Your Name");
		add(new JLabel("Hello "+name + " !!!"));
		setSize(300,300);
		setVisible(true);
	}
}
public class Main {
	public static void main(String[] args) {
		new MyFrame();
	}
}
