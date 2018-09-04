import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
		} 
		catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		int c;
		try {
		while((c=in.read())!=-1) {
				System.out.print((char)c);
				out.write(c);
		}
		}
		catch (IOException e) {
			System.out.println("Can't perform read");
		}
		finally {
			try {
				in.close();
				out.close();
				System.out.println("\nStream Closed");
			}
			catch (IOException e) {
				System.out.println("Problem with closing streams");
			}
		}
	}
}
