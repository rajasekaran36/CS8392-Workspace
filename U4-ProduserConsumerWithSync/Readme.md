# Code
```java
import java.util.LinkedList;

class Resource {
	LinkedList<Integer> list = new LinkedList<Integer>();
	int limit = 2;

	synchronized public void produce() {
		int value = 0;
		while (true) {

			while (list.size() == limit) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			value++;
			System.out.println("Producer Produced:" + value);
			list.add(value);
			notify();

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	synchronized public void consume() {
		while (true) {
			while (list.size() == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			int val = list.removeFirst();
			System.out.println("Consumer Consumed:" + val);
			notify();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ProduceThread extends Thread {
	Resource r;

	public ProduceThread(Resource r) {
		this.r = r;
	}

	public void run() {
		r.produce();
	}
}

class ConsumeThread extends Thread {
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
```
# Output
```console
Producer Produced:1
Producer Produced:2
Consumer Consumed:1
Consumer Consumed:2
Producer Produced:3
Producer Produced:4
Consumer Consumed:3
Consumer Consumed:4
Producer Produced:5
Producer Produced:6
Consumer Consumed:5
Consumer Consumed:6
Producer Produced:7
Producer Produced:8
Consumer Consumed:7
Consumer Consumed:8
Producer Produced:9
Producer Produced:10
Consumer Consumed:9
Consumer Consumed:10
Producer Produced:11
Producer Produced:12
Consumer Consumed:11
Consumer Consumed:12
Producer Produced:13
Producer Produced:14
Consumer Consumed:13
Consumer Consumed:14
Producer Produced:15
```
