import java.io.*;
public class Main {

	public static void main(String[] args) {
		Console c = System.console();
		PrintWriter pw = c.writer();
		String data = c.readLine();
		System.out.println("Enter data");
		System.out.println("Data:"+data);
		pw.println("Hello");
		pw.close();
	}

}
