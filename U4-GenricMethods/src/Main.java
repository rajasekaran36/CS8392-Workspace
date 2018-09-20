
class GenTest{
	static <E> void printType(E eObject) {
		System.out.println(eObject.getClass().getName());
	}
}
public class Main {
	public static void main(String[] args) {
		GenTest.printType("Rajasekaran");
		GenTest.printType(10);
		GenTest.printType(839.887f);
		GenTest.printType(839.8879898289982);
		GenTest.printType(83990l);
	}
}
