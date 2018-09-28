import java.util.ArrayList;
import java.util.Scanner;

class DebitException extends Exception{
	public DebitException(String message) {
		super(message);
	}
}

class Customer{
	int acc_no;
	String name;
	String mail;
	int balance;
	
	public Customer(int ano, String cName, String cMail, int initBalance) {
		this.acc_no = ano;
		this.name = cName;
		this.mail = cMail;
		this.balance = initBalance;
	}
	
	void debitTransaction(int amount) {
		System.out.println("Debit .....");
	try {
		if(this.balance >= amount)
			this.balance = this.balance - amount;
		else
			throw new DebitException("In sufficient balance");
		}
		catch (DebitException e) {
			System.out.println(e.getMessage());
			int new_amount = new Scanner(System.in).nextInt();
			debitTransaction(new_amount);
		}
		displayStatus();
	}
	void creditTransaction(int amount) {
		
	}
	void displayStatus() {
		System.out.println("AccNo:"+this.acc_no);
		System.out.println("Name:"+this.name);
		System.out.println("Mail:"+this.mail);
		System.out.println("Balance:"+this.balance);
	}
}

class Bank{
	ArrayList<Customer> bankRecord;
	public Bank() {
		bankRecord = new ArrayList<Customer>();
	}
	void displayCustomerDetails() {
		
	}
}

public class Main{
	public static void main(String[] args) {
		Customer aCustomer = new Customer(6637, "Raja", "raja@gmail.com", 5000);
		aCustomer.displayStatus();
		aCustomer.debitTransaction(6000);
	}
}