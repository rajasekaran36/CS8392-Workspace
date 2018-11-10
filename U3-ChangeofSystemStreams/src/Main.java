import java.io.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream in = new FileInputStream(new File("D:/in.txt"));
		System.setIn(in);
		Scanner inp = new Scanner(System.in);
		
		FileOutputStream out = new FileOutputStream(new File("D:/out.txt"));
		PrintStream ps = new PrintStream(out);
		System.setOut(ps);
		while(inp.hasNext())
			System.out.println("Elem : "+inp.nextLine());
		inp.close();
		ps.flush();
		ps.close();
	}

}
