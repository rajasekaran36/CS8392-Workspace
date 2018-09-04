class GenericArrays{
	<T> void printArray(T[] aArray) {
		for(T temp:aArray) {
			System.out.println(temp);
		}
	}
	
}
public class Main {

	public static void main(String[] args) {
		GenericArrays a = new GenericArrays();
		Integer[] i = {1,2,3,4};
		a.printArray(i);
		Float[] f = {1.3f,2.55f,3.56f,4.67f};
		a.printArray(f);
		String[] s = {"Apple", "Boy","Cat","Dog"};
		a.printArray(s);
	}

}
