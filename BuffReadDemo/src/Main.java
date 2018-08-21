import java.io.*;
public class Main {

	public static void main(String[] args) {
		InputStreamReader insr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(insr);
		String data = null;
		try {
			System.out.println("Please Enter Any Data:");
			data = bfr.readLine();
			System.out.println("Data received:"+data);
		}
		catch (IOException e) {
		System.out.println("Problem with reading data");
		}
		finally {
			try {
				insr.close();
				bfr.close();
				System.out.println("Stream Closed Successfully");
			} catch (IOException e) {
				System.out.println("Problem with closing stream");
			}
		}
	}

}
