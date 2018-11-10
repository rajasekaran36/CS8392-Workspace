
class PrintUpto10 extends Thread{
	String threadName;
	int n;
	public PrintUpto10(String name,int n){
		this.threadName = name;
		this.n = n;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(threadName+"--"+i);
			try {
				Thread.sleep(n);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Main {

	public static void main(String[] args) throws InterruptedException {
		PrintUpto10 t1 = new PrintUpto10("t1",1000);
		PrintUpto10 t2 = new PrintUpto10("t2",500);
		t1.start();
		t2.start();
	}
}
