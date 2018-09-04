
class PrintUpto10 extends Thread{
	String threadName;
	public PrintUpto10(String name){
		this.threadName = name;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(threadName+"--"+i);
		}
	}
}
public class Main {

	public static void main(String[] args) throws InterruptedException {
		PrintUpto10 t1 = new PrintUpto10("t1");
		PrintUpto10 t2 = new PrintUpto10("t2");
		t1.start();
		t2.start();
	}
}
