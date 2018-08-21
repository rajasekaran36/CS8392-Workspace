import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
class InvalidStudentRollNo extends Exception{
	public InvalidStudentRollNo(String message) {
		super(message);
	}
}
class Student{
	String name;
	int rollno;
	public Student() {
		try {
			InputStreamReader insr = new InputStreamReader(System.in);
			BufferedReader bfr = new BufferedReader(insr);
			System.out.println("Enter name:");
			name = bfr.readLine();
			try {
				System.out.println("Enter Rollno:");
				rollno  = Integer.parseInt(bfr.readLine());
				if(rollno<1)
					throw new InvalidStudentRollNo("Roll number is always positive");
			}
			catch (InvalidStudentRollNo e) {
				System.out.println(e.getMessage());
				rollno = 9999;
				System.out.println("Rollno assigned as 9999 [default]");
			}
		}
		catch (IOException e) {
			System.out.println("IOException Occured");
		}
	}
}
public class Main {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("Name:"+s.name);
		System.out.println("Rollno:"+s.rollno);
	}
}
