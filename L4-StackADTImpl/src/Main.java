
interface StackOps {
	void push(int anElement);
	int pop();
	int top();
	void display();
}

class MyStack implements StackOps{
	
	int[] data = new int[5];
	int top = -1;
	@Override
	public void push(int anElement) {
		top++;
		data[top] = anElement;
	}

	@Override
	public int pop() {
		
		return 0;
	}

	@Override
	public int top() {
		
		return 0;
	}

	@Override
	public void display() {
		
	}
	
}
public class Main {

}
