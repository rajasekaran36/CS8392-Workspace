class PrintNumbers extends Thread{
	int limit;
	public PrintNumbers(int limit) {
		this.limit = limit;
	}
	public void run() {
		for(int i=1;i<=limit;i++) {
			System.out.println("This thread is demon:"+this.isDaemon()+" Printing "+i);
		}
	}
}
public class Main {

	public static void main(String[] args) {
		PrintNumbers t1 = new PrintNumbers(10);
		PrintNumbers t2 = new PrintNumbers(20);
		t1.setDaemon(true);
		t2.start();
		t1.start();
	}

}
