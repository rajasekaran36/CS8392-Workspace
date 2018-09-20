class GenericNumberArrays{
	public static <T extends Number> double getSumofElements(T[] aArray) {
		double sum = 0;
		for(T temp:aArray) {
			sum = sum + temp.doubleValue();
		}
		return sum;
	}
	
}
public class Main {

	public static void main(String[] args) {
		Integer[] i = {1,2,3,4};
		Float[] f = {1.3f,2.55f,3.56f,4.67f};
		int sum_i = (int)GenericNumberArrays.getSumofElements(i);
		System.out.println("Sum of Integer Array:"+sum_i);
		float sum_f = (float)GenericNumberArrays.getSumofElements(f);
		System.out.println("Sum of Float Array:"+sum_f);

		String[] s = {"Apple", "Boy","Cat","Dog"};
		GenericNumberArrays.getSumofElements(s);
	}

}
