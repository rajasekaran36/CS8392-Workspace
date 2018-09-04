
class GenTest<T>{
	T aObject;
	public GenTest(T c){
		this.aObject = c;  
	}
	public void printType() {
		System.out.println(aObject.getClass().getName());
	}
}
public class Main {
	public static void main(String[] args) {
		
		GenTest<String> a = new GenTest<String>("Raja");
		GenTest<Integer> b = new GenTest<Integer>(3);
		a.printType();
		b.printType();
		
	}
}
