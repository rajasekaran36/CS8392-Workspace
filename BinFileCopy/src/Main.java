import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws FileNotFoundException,IOException{
		InputStreamReader insr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(insr);
		String inputFilePath = null;
		System.out.println("Enter Image Location:");
		inputFilePath = bfr.readLine();
		FileInputStream fins = new FileInputStream(inputFilePath);
		System.out.println("Enter Destination Filename");
		String dst = bfr.readLine();
		File outFile = new File(dst);
		outFile.createNewFile();
		FileOutputStream fouts = new FileOutputStream(outFile);
		int c;
		while((c=fins.read())!=-1)
			fouts.write(c);
		fins.close();
		fouts.close();
		bfr.close();
		insr.close();
		System.out.println("Done");
	}
}
