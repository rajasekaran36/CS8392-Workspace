import java.io.*;
class Main{
	public static void main(String[] args) throws IOException{
		int number = 0;
		InputStreamReader insr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(insr);
		
		System.out.println("Echo Program for Numbers");
		System.out.println("------------------------");
		
		while(number!=-1){		
			System.out.println("Please Enter and Positive Number (-1 for exit)");
			number = Integer.parseInt(bfr.readLine());
			System.out.println("-->"+number);
		}
		System.out.println("Thank you !!!");
	}
}