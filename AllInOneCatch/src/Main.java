
public class Main {
	public static void main(String[] args) {
		try {
		int ans = 10/0;
		String name = null;
		System.out.println(name.length());
		int[] x = {10,20};
		System.out.println(x[3]);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException Occurred");
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException Occurred");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occurred");
		}
		System.out.println("Thank You !!!");
	}
}
