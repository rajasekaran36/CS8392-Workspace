class PrintNumbers extends Thread{
	String name;
	int limit;
	public PrintNumbers(String name, int limit) {
		this.name = name;
		this.limit = limit;
	}
	public void print() {
		for(int i = 1;i<=limit;i++) {
			this.isDaemon();
			System.out.println(name+"--"+i+"--"+this.isDaemon());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void run() {
		print();
	}
}
public class Main {

	public static void main(String[] args) {
		PrintNumbers t1 = new PrintNumbers("A", 10);
		PrintNumbers t2 = new PrintNumbers("B", 100);
		t1.setDaemon(true);
		t2.start();
		
		t1.start();
	}

}
