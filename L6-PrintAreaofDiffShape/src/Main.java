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

class Triangle extends Shape{

	public Triangle(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	void printArea() {
		
		double area;
		area = (0.5)*x*y;
		System.out.println("Area of Rectangle is "+area);
	}
	
}

class Circle extends Shape{

	public Circle(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	void printArea() {
		
		double area;
		area = (Math.PI)*x*x;
		System.out.println("Area of Rectangle is "+area);
	}
	
}


public class Main {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10,20);
		Triangle t1 = new Triangle(10, 20);
		Circle c1 = new Circle(10,10);
		r1.printArea();
		t1.printArea();
		c1.printArea();
	}

}
