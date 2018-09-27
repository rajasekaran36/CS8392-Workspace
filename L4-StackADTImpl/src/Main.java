
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
		try {
		top++;
		data[top] = anElement;
		System.out.println(anElement+" is pushed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You can't push try pop");
			top--;
		}
	}

	@Override
	public int pop() {
		int poped_element = data[top];
		top--;
		System.out.println("Current Top"+data[top]);
		return poped_element;
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
	public static void main(String[] args) {
		MyStack aStack = new MyStack();
		aStack.push(100);
		aStack.push(200);
		aStack.push(300);
		aStack.push(400);
		aStack.push(500);
		aStack.push(600);
	}
}
