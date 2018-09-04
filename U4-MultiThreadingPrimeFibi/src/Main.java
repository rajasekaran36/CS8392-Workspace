
class FindPrime extends Thread{
	int number;
	String value = "Prime";
	public FindPrime(int number) {
		this.number = number;
	}
	public void run() {
		for(int i=1;i<number;i++) {
			if(number%i == 0) {
				this.value = "Not Prime";
				break;
			}
		}
		System.out.println("The number "+this.number+" is "+this.value+" number");
	}
}

class Fibonacci extends Thread{

	int limit;
	public Fibonacci(int limit) {
		this.limit = limit;
	}
	
	public void run() {
		int p1 = -1;
		int p2 =  1;
		int temp;
		for(int i=0;i<=this.limit;i++) {
			temp = p1 + p2;
			p1 = p2;
			p2 = temp;
			System.out.println(p2);
			new FindPrime(p2).start();
		}
	}
}

public class Main {

	public static void main(String[] args) {
		new Fibonacci(10).start();
	}

}
