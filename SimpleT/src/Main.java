class PrintUpto10 extends Thread{
	String name;
	int time;
	public PrintUpto10(String name, int time) {
		this.name = name;
		this.time = time;
		
	}
	public void run() {
		try {
			print();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void print() throws InterruptedException {
		for(int i=1;i<=10;i++) {
			System.out.println(name+"--"+i);
			//Thread.sleep(time);
		}
		
	}
}
public class Main {

	public static void main(String[] args) {
		PrintUpto10 p1 = new PrintUpto10("p1",1000);
		PrintUpto10 p2 = new PrintUpto10("p2",1000);
		p1.start();
		p2.start();

	}

}
