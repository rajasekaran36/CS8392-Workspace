import java.util.Random;

class SFinder extends Thread{
	int number;
	int snumber;
	
	public SFinder(int number) {
		this.number = number;
	}
	
	public void run() {
		snumber = number * number;
		System.out.println(number+" Square is "+snumber);
	}
}

class CFinder extends Thread{
	int number;
	int cnumber;
	
	public CFinder(int number) {
		this.number = number;
	}
	
	public void run() {
		cnumber = number * number * number;
		System.out.println(number+" Cube is "+cnumber);
	}
}

class RandGen extends Thread{
	int limit = 1000;
	Random rand;
	
	public RandGen() {
		this.limit = limit;
		rand = new Random();
	}
	
	public void run() {
		while(true) {
		try {
			this.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int number = rand.nextInt(limit);
		System.out.println("Number Generated : "+number);
		if(number % 2 == 0)
			new SFinder(number).start();
		else
			new CFinder(number).start();
	}
	}
}	
public class Main {

	public static void main(String[] args) {
		RandGen rg = new RandGen();
		rg.start();
	}

}
