import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Enter file path with name and ext:");
		String fPath = new Scanner(System.in).nextLine();
		
		File aFile = new File(fPath);
		
		if(aFile.exists())
			System.out.println("File is Available");
		
		if(aFile.canRead())
			System.out.println("File Readable");
		
		if(aFile.canWrite())
			System.out.println("File Writeable");
		
		System.out.println(aFile.getName());
		
		System.out.println("Size : "+ aFile.length()+ "Bytes");
	}
}
