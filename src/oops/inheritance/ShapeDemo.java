package oops.inheritance;

public class ShapeDemo {
	public static void main(String args[]) {
		Circle c = new Circle(10);
		c.area();
		c.perimeter();
		double area = c.area();
		System.out.println("circle area =" + area);

		System.out.println("circle perimeter =" + c.perimeter());
		Circle c2 = new Circle(100);
		System.out.println("circle area =" + c2.area());
		System.out.println("circle perimeter=" + c2.perimeter());
		Circle c3 = new Circle(500);
		System.out.println("circle ara=" + c3.area());
		System.out.println("circle perimeter =" + c3.perimeter());

		Rect r = new Rect(10, 12);
		System.out.println("rectangle area=" + r.area());
		System.out.println("rectangle perimeter=" + r.perimeter());
		Rect r1 = new Rect(100, 120);
		System.out.println("rect area=" + r1.area());
		System.out.println("rect peri=" + r1.perimeter());
		System.out.println("-----------------------");
		int arr[] = { 10, 20, 30, 50 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int a = 10;
		int[] arra = {};
		Circle c7 = new Circle(1);
		// carr is a variable of circle array of size 4(index 0 to 3)
		// index 0=c2 existing circle object
		// index 1=c3 existing circle object
		// index 2=c existing circle object
		// index 3=new circle obj created
		Circle[] carr = { c2, c3, c, new Circle(1) };// c2,c,c3 are the existing circle object
		Circle[] carr1 = { new Circle(89), new Circle(15) };// array created with not null values
		Circle[] carr2 = new Circle[3];// array created with size 3 with null values
		carr2[0] = new Circle(2);
		carr2[1] = new Circle(22);
		carr2[2] = new Circle(12);

		for (int i = 0; i < carr.length; i++) {
			System.out.println("radius=" + carr[i].getRadius());
			System.out.println("area=" + carr[i].area());

			System.out.println("perimeter=" + carr[i].perimeter());
		}
		Shape s = new Circle(7);
		Shape[] sarr = { s, new Circle(14), new Circle(12) };
		for (int i = 0; i < sarr.length; i++) {
			System.out.println("area of circle=" + sarr[i].area() + "\nperimeter of circle =" + sarr[i].perimeter());

		}
		Shape[] op = { new Rect(12, 14), new Rect(100, 200), new Rect(130, 12) };
		for (int i = 0; i < op.length; i++) {
			System.out.println("area of rect=" + op[i].area() + "\nperimeter of rect=" + op[i].perimeter());
		}

		Shape[] mixedShapes = new Shape[3];// shape array not Shape object
		mixedShapes[0] = new Circle(3);// Circle is a Shape
		mixedShapes[1] = new Rect(3, 4);// Rectangle is a Shape
		mixedShapes[2] = new Circle(99);
		for (int i = 0; i < mixedShapes.length; i++) {
			System.out.println("Shape is " + mixedShapes[i].getClass());
			System.out.println("area is=" + mixedShapes[i].area() + "\nperimeter is=" + mixedShapes[i].perimeter());
			// System.out.println("radius is"+mixedShapes[i].getRadius());//we cannot call
			// the method of sub class using super type referance
			// getRadius() belongs to Circle class but mixedShape[i] is of shape type
		}
	}

}

interface Shape {
	double area();

	double perimeter();

}

class Circle implements Shape {
	private double r;

	double getRadius() {
		return r;
	}

	Circle(double rad) {
		r = rad;
	}

	public double area() {
		return 3.14 * r * r;

	}

	public double perimeter() {
		return 2 * 3.14 * r;
	}
}

class Rect implements Shape {
	double l;
	double b;

	Rect(double len, double bre) {
		l = len;
		b = bre;
	}

	public double area() {
		return l * b;

	}

	public double perimeter() {
		return 2 * (l + b);
	}
}