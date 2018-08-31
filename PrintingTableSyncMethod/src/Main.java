
class Table{
	static synchronized void printTable(int number) {
		System.out.println("printTableEntry");
			for(int i=1;i<=5;i++) {
				System.out.println(i*number);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}	
			System.out.println("printTableExit");
		}
}

class Print5thTable extends Thread{
	Table t;
	public Print5thTable(Table t) {
		this.t = t;
	}
	public void run() {
		Table.printTable(5);
	}
}

class Print100thTable extends Thread{
	Table t;
	public Print100thTable(Table t) {
		this.t = t;
	}
	public void run() {
		Table.printTable(100);
	}
}
public class Main {

	public static void main(String[] args) {
		Table t = new Table();
		Print5thTable t1 = new Print5thTable(t);
		Print100thTable t2 = new Print100thTable(t);
		t1.start();
		t2.start();
	}

}