import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileReader fr = new FileReader("input.txt");
		FileWriter fw = new FileWriter("output.txt");
		int c;
		while((c=fr.read())!=-1) {
			System.out.print((char)c);
			fw.write(c);
		}
		fr.close();
		fw.close();
	}
}
