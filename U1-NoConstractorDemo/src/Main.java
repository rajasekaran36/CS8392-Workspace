import java.io.*;
class Student{
int rollno;
String name;

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

void getDetails(){
System.out.println("Student Details");
System.out.println("---------------");
System.out.println("Rollno:"+rollno);
System.out.println("Name:"+name);
}

}

class Main{

public static void main(String[] args)throws IOException{

Student l = new Student();
l.setDetails();
l.getDetails();

}
}