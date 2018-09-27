import java.io.*;

class Student{
	int rollno;
	String name;
	
	void setDetails() throws IOException{
		String s_rollno;
		InputStreamReader insr = new InputStreamReader(System.in);
		BufferedReader bfr=new BufferedReader(insr);
		
		System.out.println("Enter Rollno");
		s_rollno = bfr.readLine();
		rollno = Integer.parseInt(s_rollno);
		
		System.out.println("Enter Name");
		name = bfr.readLine();
		
	}
	void getDetails(){
		System.out.println("Rollno:"+rollno);
		System.out.println("Name:"+name);
	}
	
}

class Main{
	public static void main(String[] args) throws IOException{
		
		Student s = new Student();
		s.setDetails();
		s.getDetails();
	}
}