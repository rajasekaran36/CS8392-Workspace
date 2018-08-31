import java.util.LinkedList;

class ProdocerConsumer{
	LinkedList<Integer> list = new LinkedList<Integer>();
	int size = 2;
	
	public void produce() {
		int value = 0;
		while(true) {
		synchronized (this) {
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
	}
	
	public void consume() {
		int value = 0;
		while(true) {
			synchronized (this) {
		while(list.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int val = list.removeFirst();
		System.out.println("Consumer Consumer:"+val);
		notify();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		}
	}
}
public class Main {

	public static void main(String[] args) {
		ProdocerConsumer pc = new ProdocerConsumer();
		Thread p = new Thread(new Runnable() {
			
			@Override
			public void run() {
				pc.produce();
			}
		});
		Thread c = new Thread(new Runnable() {
			
			@Override
			public void run() {
				pc.consume();
			}
		});
		
		p.start();
		c.start();
	}

}
