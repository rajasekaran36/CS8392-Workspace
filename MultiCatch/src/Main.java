
public class Main {
	public static void main(String[] args) {
		try {
		int ans = 10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException Occurred");
		}
		try {
			String name = null;
			System.out.println(name.length());
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException Occurred");
		}
		try {
			int[] x = {10,20};
			System.out.println(x[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occurred");
		}
		System.out.println("Thank You !!!");
	}
}
