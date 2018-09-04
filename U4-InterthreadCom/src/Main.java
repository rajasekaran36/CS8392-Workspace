class Customer{
	int balance = 10000;
	public synchronized void withDraw(int amount) {
		if(amount<=balance) {
			balance = balance - amount;
			System.out.println("Amount debited");
		}
		else {
			System.out.println("Less Amount");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void deposit(int amount) {
		balance = balance + amount;
		System.out.println("Amount Credited");
		notify();
	}
}
class DebitTransaction extends Thread{
	Customer c;
	public DebitTransaction(Customer c) {
		this.c = c;
	}
	public void run() {
		c.withDraw(15000);
	}
}
class CreditTransaction extends Thread{
	Customer c;
	public CreditTransaction(Customer c) {
		this.c = c;
	}
	public void run() {
		c.deposit(10000);
	}
}
public class Main {
	public static void main(String[] args) {
		Customer aCustomer = new Customer();
		CreditTransaction ct = new CreditTransaction(aCustomer);
		DebitTransaction dt = new DebitTransaction(aCustomer);
		dt.start();
		ct.start();
	}
}
