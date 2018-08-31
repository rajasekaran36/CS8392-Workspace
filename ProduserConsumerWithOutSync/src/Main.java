import java.util.LinkedList;

class Resource{
	LinkedList<Integer> list = new LinkedList<Integer>();
	int size = 2;
	
	synchronized public void produce() {
		int value = 0;
		while(true) {
		
		while(list.size() == size) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Producer Produced:"+value);
		list.add(value++);
		notify();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
	
	synchronized public void consume() {
		while(true) {
		while(list.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int val = list.removeFirst();
		System.out.println("Consumer Consumed:"+val);
		notify();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

class ProduceThread extends Thread{
	Resource r;
	public ProduceThread(Resource r) {
		this.r = r;
	}
	public void run() {
		r.produce();
	}
}
class ConsumeThread extends Thread{
	Resource r;
	public ConsumeThread(Resource r) {
		this.r = r;
	}
	public void run() {
		r.consume();
	}
}
public class Main {

	public static void main(String[] args) {
		Resource r = new Resource();
		ProduceThread p = new ProduceThread(r);
		ConsumeThread c = new ConsumeThread(r);
		p.start();
		c.start();
	}

}