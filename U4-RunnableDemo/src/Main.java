class PrintNums implements Runnable{

	int limit;
	public PrintNums(int limit) {
		this.limit = limit;
	}
	public void printNum(int limit) {
		for(int i = 1;i<=limit;i++)
			System.out.println(i);
	}
	@Override
	public void run() {
		printNum(limit);
	}
	
}
public class Main {

	public static void main(String[] args) {
		PrintNums r1 = new PrintNums(10);
		PrintNums r2 = new PrintNums(100);
		Thread t1 = new Thread(r1);
		t1.start();
		Thread t2 = new Thread(r2);
		t2.start();
	}

}
