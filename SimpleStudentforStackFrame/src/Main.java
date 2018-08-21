class Student{
	int rollno;
	String name;
	public Student(int rollno,String name) {
		this.rollno = rollno;
		this.name = name;
	}
	public void displayDetails() {
		System.out.println("Name:"+this.name);
		System.out.println("Rollno:"+this.rollno);
	}
}
public class Main {
	
	public static void main(String[] args) {
		Student s = new Student(23,"Rajasekaran");
		s.displayDetails();
	}
}
