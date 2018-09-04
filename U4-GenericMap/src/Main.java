
class GenTest<T,U>{
	T tObject;
	U uObject;
	public GenTest(T t,U u){
		this.tObject = t;
		this.uObject = u;
	}
	public void printType() {
		System.out.println("T Object Type:"+tObject.getClass().getName());
		System.out.println("U Object Type:"+uObject.getClass().getName());
	}
}
public class Main {
	public static void main(String[] args) {
		
		GenTest<String,Integer> a = new GenTest<String,Integer>("Raja",13);
		a.printType();
	}
}
