import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

class TimeSetter extends Thread {
	Label time;
	public TimeSetter(Label time) {
		this.time = time;
		this.start();
	}
	public void run() {
		while(true) {
		Date d = new Date();
		time.setText(d.toString());
		
		try {
			this.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
}

class MyFrame extends Frame{
	Panel p;
	Label time;
	TimeSetter t;
	public MyFrame() {
		p = new Panel();
		time = new Label("00:00:00");
		t = new TimeSetter(time);
		p.add(time);
		add(p);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		}
		);
		setSize(300, 300);
		setTitle("Hello AWT");
		setVisible(true);
		updateTime();
	}
	
	void updateTime() {
	}
}

public class Main {

	public static void main(String[] args) {
		new MyFrame();
	}

}
