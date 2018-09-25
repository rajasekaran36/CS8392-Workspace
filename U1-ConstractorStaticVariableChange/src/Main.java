import java.io.*;

class Student {
	static int count;
	int rollno;
	String name;

//Constructor with out arguments-Default Constructor

	Student() {
		System.out.println("Default Constructor Called");
		rollno = -1;
		name = "No name";
		count = count + 1;
	}

//Constructor with arguments-Parameterised Constructor

	Student(int rno, String n) {
		System.out.println("Parameterised Constructor Called");
		rollno = rno;
		name = n;
		count = count + 1;
	}

//Get the details from user and set

	void setDetails() throws IOException {
		String s_rollno;
		InputStreamReader insr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(insr);

		System.out.println("Enter Student Rollno");
		s_rollno = bfr.readLine();
		rollno = Integer.parseInt(s_rollno);

		System.out.println("Enter Student Name:");
		name = bfr.readLine();

	}

//Display Student Details

	void getDetails() {
		System.out.println("Student Details");
		System.out.println("---------------");
		System.out.println("Rollno:" + rollno);
		System.out.println("Name:" + name);
		System.out.println("Count :" + count);
	}

	static void getCount() {
		System.out.println("Current Count" + count);
	}
}

class Main {

	public static void main(String[] args) throws IOException {

		Student m = new Student();

		Student l = new Student(23,"Raj");

		Student.getCount();

	}
}