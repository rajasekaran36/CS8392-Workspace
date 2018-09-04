class GenericNumberArrays{
	public static <T extends Number> void printArray(T[] aArray) {
		for(T temp:aArray) {
			System.out.println(temp);
		}
	}
	
}
public class Main {

	public static void main(String[] args) {
		Integer[] i = {1,2,3,4};
		GenericNumberArrays.printArray(i);
		Float[] f = {1.3f,2.55f,3.56f,4.67f};
		GenericNumberArrays.printArray(f);
		/*
		String[] s = {"Apple", "Boy","Cat","Dog"};
		GenericNumberArrays.printArray(s);
		*/
	}

}
