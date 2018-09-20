class PrintNumbers implements Runnable{
	int start_no;
	public PrintNumbers(int start_no) {
		this.start_no = start_no;
	}
	public void run() {
		for(int i=start_no;i<=start_no+10;i++)
			System.out.println(i);
	}
}
public class Main {

	public static void main(String[] args) {
		
		PrintNumbers r1 = new PrintNumbers(1);
		PrintNumbers r2 = new PrintNumbers(21);
		PrintNumbers r3 = new PrintNumbers(71);
		
		ThreadGroup tg = new ThreadGroup("Group A");
		
		Thread t1 = new Thread(tg, r1, "one");
		Thread t2 = new Thread(tg, r2, "two");
		Thread t3 = new Thread(tg, r3, "three");
		System.out.println(tg.isDaemon());
		t1.start();
		t2.start();
		t3.start();
		
	}

}
