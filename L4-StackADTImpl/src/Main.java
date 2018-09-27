
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
		try {
			int poped_element = data[top];
			data[top] = 0;
			top--;
			System.out.println("Poped Element: "+poped_element);
			System.out.println("Current Top: "+data[top]);
			return poped_element;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Stack is Empty try some push");
			top++;
			return -1;
		}
	}

	@Override
	public int top() {
	System.out.println("Top Element : "+data[top]);
		return 0;
	}

	@Override
	public void display() {
		for(int i=data.length-1;i>=0;i--)
				System.out.println(data[i]);
	}
	
}
public class Main {
	public static void main(String[] args) {
		MyStack aStack = new MyStack();
		aStack.push(100);
		aStack.push(200);
		aStack.push(300);
		aStack.display();
		aStack.top();
		aStack.pop();
		aStack.display();
		aStack.top();
	}
}
