# Code
```java
class PrintNumbers extends Thread{
	int limit;
	public PrintNumbers(int limit) {
		this.limit = limit;
	}
	public void run() {
		for(int i=1;i<=limit;i++) {
			System.out.println("This thread is demon:"+this.isDaemon()+" Printing "+i);
		}
	}
}
public class Main {

	public static void main(String[] args) {
		PrintNumbers t1 = new PrintNumbers(10);
		PrintNumbers t2 = new PrintNumbers(20);
		t1.setDaemon(true);
		t2.start();
		t1.start();
	}

}

```
# Output
```console
This thread is demon:false Printing 1
This thread is demon:true Printing 1
This thread is demon:false Printing 2
This thread is demon:false Printing 3
This thread is demon:false Printing 4
This thread is demon:false Printing 5
This thread is demon:false Printing 6
This thread is demon:false Printing 7
This thread is demon:false Printing 8
This thread is demon:false Printing 9
This thread is demon:false Printing 10
This thread is demon:false Printing 11
This thread is demon:false Printing 12
This thread is demon:true Printing 2
This thread is demon:true Printing 3
This thread is demon:true Printing 4
This thread is demon:false Printing 13
This thread is demon:true Printing 5
This thread is demon:true Printing 6
This thread is demon:true Printing 7
This thread is demon:true Printing 8
This thread is demon:true Printing 9
This thread is demon:true Printing 10
This thread is demon:false Printing 14
This thread is demon:false Printing 15
This thread is demon:false Printing 16
This thread is demon:false Printing 17
This thread is demon:false Printing 18
This thread is demon:false Printing 19
This thread is demon:false Printing 20

```