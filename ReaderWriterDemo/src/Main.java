class Resource{
	int count = 0;
	public synchronized void change(String name) {
		if(name.equals("Reader"))
			for(int i=5;i>=1;i--) {
				System.out.println("Reader reads:"+count);
				count--;
			}
		else {
			for(int i=1;i<=5;i++) {
				count++;
				System.out.println("Writer writes:"+count);
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
		r.change("Reader");
	}
}

class WriterThread extends Thread{
	Resource r;
	public WriterThread(Resource r) {
		this.r = r;
	}
	public void run() {
		r.change("Writer");
	}
}
public class Main {

	public static void main(String[] args) {
		Resource r = new Resource();
		ReaderThread rt = new ReaderThread(r);
		WriterThread wt = new WriterThread(r);
		
		wt.start();
		rt.start();
	}

}
