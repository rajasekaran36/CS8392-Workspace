
public class Main {
	public static void main(String[] args) {
		try {
			//Block 0
			System.out.println("Entering into Block 0");
			try {
				//Block 1
				System.out.println("Entering into Block 1");
				String name = null;
				System.out.println(name.length());
			}
			catch(NullPointerException e) {
				//Block 1 catch
				System.out.println("Block 1 Catch NullPointerException");
				System.out.println("NullPointerException Occurred");
				System.out.println("Exit from  NullPointerException Catch");
			}
			System.out.println("Exit from Block 1");
			int ans = 10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Block 0 Catch ArithmeticException");
			System.out.println("ArithmeticException Occurred");
			System.out.println("Exit from  ArithmeticException Catch");
		}
		System.out.println("Thank You !!!");
	}
}
