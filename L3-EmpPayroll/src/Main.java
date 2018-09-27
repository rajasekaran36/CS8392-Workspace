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
		
		double da = (bp/100)*97;
		double hra = (bp/100)*10;
		double pf = (bp/100)*12;
		double staff_club = (bp/100)*0.1;		
		double gross_pay = bp+da+hra+pf+staff_club;
		double net_pay = gross_pay-pf-staff_club;
		
		System.out.println("Earnings");
		System.out.println("BP :"+bp);
		System.out.println("DA :"+da);
		System.out.println("HRA :"+hra);
		System.out.println("Deductions");
		System.out.println("PF :"+pf);
		System.out.println("Staff Club :"+staff_club);
		
		System.out.println("Gross Pay :"+gross_pay);
		System.out.println("Net Pay :"+net_pay);
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
		//p.genPayslip();
	}

}
