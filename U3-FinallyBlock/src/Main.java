import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		int a,b,result;
		InputStreamReader insr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(insr);
		try {
			System.out.println("Enter A");
			a = Integer.parseInt(bfr.readLine());
			System.out.println("Enter B");
			b = Integer.parseInt(bfr.readLine());
			result = a/b;
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException Occured");
		}
		
		finally {
			System.out.println("Finally Block Executed");
			bfr.close();
			insr.close();
		}
		
	}
}
