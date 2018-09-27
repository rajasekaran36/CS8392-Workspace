import java.util.Scanner;

class Employee {
	int bp;
	int emp_id;
	String name;
	String address;
	String mail;
	long mob_no;
	
	public Employee(int bp){
		this.bp = bp;
		getDetails();
		displayDetails();
		genPayslip();
	}
	void getDetails() {
		Scanner input = new Scanner(System.in);
		System.out.println("Id:"); this.emp_id = input.nextInt();input.nextLine();
		System.out.println("Name:"); this.name = input.nextLine();
		System.out.println("Address"); this.address = input.nextLine();
		System.out.println("Mail:"); this.mail = input.nextLine();
		System.out.println("mobile:"); this.mob_no = input.nextLong();
	}
	
	void displayDetails() {
		System.out.println("Id:"+this.emp_id);
		System.out.println("Name:"+this.name);
		System.out.println("Address:"+this.address);
		System.out.println("Mail:"+this.mail);
		System.out.println("Mobile no:"+this.mob_no);
	}
	
	void genPayslip() {
		
	}
}

class Programmer extends Employee {
	public Programmer(int bp) {
		super(bp);
	}
}

public class Main {

	public static void main(String[] args) {
		Programmer p = new Programmer(50000);
		p.genPayslip();
	}

}
