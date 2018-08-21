import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		InputStreamReader insr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(insr);
		int a = 10;
		int b = 0;
		int result = 0;
		try {
			result = a/b;
		}
		catch(ArithmeticException e) {
			try {
				System.out.println("Enter valid b value");
				b = Integer.parseInt(bfr.readLine());
				result = a/b;
			}
			catch(Exception l) {
				System.out.println("Assigned b = 1");
				b = 1;
				result = a/b;
			}
		}
		System.out.println("Result = "+result);
		System.out.println("Thank You !!!");
	}
}
