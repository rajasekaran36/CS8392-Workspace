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
		
		boolean isFound = false;
		
		for(String aString: aList) {
			if(aString.equalsIgnoreCase(data)) {
				isFound = true;
				break;
			}
		}
		if(isFound)
			System.out.println(data+" String found");
		else
			System.out.println(data + " String not found");
		
	}
	void listStrings(char cChar) {
		for(String aString:aList) {
			char fChar = aString.charAt(0);
			if(fChar == cChar)
				System.out.println(aString);
		}
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
		sl.searchString("ball");
		sl.searchString("hat");
		sl.listStrings('c');
	}
}