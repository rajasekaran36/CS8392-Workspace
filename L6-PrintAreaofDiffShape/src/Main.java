import org.w3c.dom.css.Rect;

import javafx.scene.effect.Shadow;

abstract class Shape{
	int x;
	int y;
	abstract void printArea();
}

class Rectangle extends Shape{

	public Rectangle(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	void printArea() {
		
		double area;
		area = x*y;
		System.out.println("Area of Rectangle is "+area);
	}
	
}
public class Main {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10,20);
		Shape r2 = new Rectangle(50, 100);
		r1.printArea();
		r2.printArea();
	}

}
