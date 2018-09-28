import java.util.ArrayList;

class StringList{
	ArrayList<String> aList;
	public StringList() {
		aList = new ArrayList<String>();
	}
	void appendString(String data) {
		aList.add(data);
		display();
	}
	void insertInto(String data, int pos) {
		aList.add(pos, data);
		display();
	}
	void searchString(String data) {
		
	}
	void listStrings(char aChar) {
		
	}
	void display() {
		System.out.println("Display called");
		System.out.println("--------------");
		for(String ele: aList) {
			System.out.println(ele);
		}
	}
}
public class Main{
	public static void main(String[] args) {
		
		StringList sl = new StringList();
		sl.appendString("Apple");
		sl.appendString("Ball");
		sl.appendString("Cat");
		sl.appendString("Car");
		sl.insertInto("Mango", 1);
	}
}