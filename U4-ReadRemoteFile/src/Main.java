import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		URL u = new URL("https://drive.google.com/uc?authuser=0&id=1xBCSHKksaYuavTuryaunSDYGhHmMybmp&export=download");
		Scanner scn = new Scanner(u.openStream());
		while(scn.hasNext()) {
			System.out.println(scn.nextLine());
		}
	}

}
