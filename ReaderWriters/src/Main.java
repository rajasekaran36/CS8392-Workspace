import java.util.Arrays;

class Resource{
	int[] data = new int[5];
	int current_pos = 0;
	public void change(String who) {
		synchronized (this) {
		if(current_pos<5 && current_pos > -1) {
		if(who.equals("Reader")){
			data[current_pos] = 0;
			current_pos--;
			System.out.println("Reader Called "+Arrays.toString(data));
		}
		else {
			data[current_pos] = 1;
			current_pos++;
			System.out.println("Writter Called "+Arrays.toString(data));
		}
		}
		else if (current_pos == -1){
			current_pos = 0;
		}
		else {
			current_pos = 4;
		}
	}
	}
}
class ReaderThread extends Thread{
	Resource r;
	public ReaderThread(Resource r) {
		this.r = r;
	}
	public void run() {
		reader();
	}
	public synchronized void reader() {
		for(int i=0;i<100;i++) {	
			r.change("Reader");
			try {
				this.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class WritterThread extends Thread{
	Resource r;
	public WritterThread(Resource r) {
		this.r = r;
	}
	public void run() {
		writer();
	}
	public synchronized void writer() {
		for(int i=0;i<100;i++) {
			r.change("Writer");
			try {
				this.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Main {

	public static void main(String[] args) throws InterruptedException {
		Resource aResource = new Resource();
		ReaderThread rThread = new ReaderThread(aResource);
		WritterThread wThread = new WritterThread(aResource);
			wThread.start();
			rThread.start();
	}

}
