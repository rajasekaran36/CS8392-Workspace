class Table {
	synchronized void printTable(int n) {
		for(int i=1;i<5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		/*
		 void printTable(int n) {
			for(int i=1;i<5;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		*/
}
}
class Thread1 extends Thread{
	Table t;
	public Thread1(Table t) {
		this.t = t;
	}
	public void run() {
		t.printTable(5);
	}
}
class Thread2 extends Thread{
	Table t;
	public Thread2(Table t) {
		this.t = t;
	}
	public void run() {
		t.printTable(100);
	}
}

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Table t = new Table();
		Thread1 t1 = new Thread1(t);
		Thread2 t2 = new Thread2(t);
		t1.join();
		t2.join();
	}
}
