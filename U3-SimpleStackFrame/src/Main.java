class Student{
	int rollno;
	String name;
	public Student(int rollno,String name) {
		this.rollno = rollno;
		this.name = name;
	}
	public void displayDetails() {
		System.out.println("Student Name:"+this.name);
		System.out.println("Student Rollno:"+this.rollno);
		System.out.println("Stack Trace at displayDetails in Student Class");
		StackTraceElement[] elements = Thread.currentThread().getStackTrace();
		for(StackTraceElement aElement:elements) {
			System.out.println(aElement);
		}
		
	}
}
public class Main {
	
	public static void main(String[] args) {
		/*
		System.out.println("Stack Trace at main in Main Class");
		StackTraceElement[] elements = Thread.currentThread().getStackTrace();
		for(StackTraceElement aElement:elements) {
			System.out.println(aElement);
		}
		*/
		Student s = new Student(23,"Rajasekaran");
		s.displayDetails();
	}
}
