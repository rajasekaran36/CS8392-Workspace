import java.util.LinkedList;

class Resource{
	LinkedList<Integer> list = new LinkedList<Integer>();
	int size = 2;
	public void produce() {
		int value = 0;
		while(true) {
			if(list.size() == 0) {
			System.out.println("Producer Produced:"+value);
			list.add(value++);
			}
		}
	}
	public void consume() {
		while(true) {
		if(list.size() == size) {
		int val = list.removeFirst();
		System.out.println("Consumer Consumed:"+val);
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
		c.start();
		p.start();
	}

}