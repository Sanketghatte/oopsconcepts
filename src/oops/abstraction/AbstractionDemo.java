
package oops.abstraction;

//abstraction means hiding unnecessary details and exposing only necessary information 
// make class variable private i.e. POJO:Plain Old Java Object
// provide public getter and setter to manipulate private variable 
//abstract concrete classes  by creating interfaces i.e. programming to interface
public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BadCar c = new BadCar();
		c.engineCapacity = 100;// member variable is accessible out side of class Car and modifiable
		// this is against of abstraction principal
		System.out.println(c);
		System.out.println("the capacity of engine is=" + c.engineCapacity);

		GoodCar g = new GoodCar();
		// g.engineCapacity = 100; engineCapicity is private to class GoodCar and not
		// accessible out side
		// but GoodCar exposes two public method (setter and getter) to deal with engine
		// capacity
		g.setEngineCapacity(100);// setter
		System.out.println("the capacity of engine=" + g.getEngineCapacity());// getter

		g.accelerete();
		g.accelerete();
		g.accelerete();
		g.setGear('D');
		g.accelerete();
		g.accelerete();
		g.accelerete();
		g.accelerete();
		g.setGear('R');
		g.accelerete();
		g.accelerete();

		Vehicle v = new GoodCar();// reference type is vehicle (interface)
		v.move();
	}

}

class BadCar {
	int engineCapacity;

}

class GoodCar implements Vehicle {
	private int engineCapacity;

	private char gear;// R,N,D

	public GoodCar() {
		gear = 'N';
	}

	public void setEngineCapacity(int capacity) {
		this.engineCapacity = capacity;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setGear(char gear) {
		this.gear = gear;
	}

	public void accelerete() {
		if (gear == 'R') {
			System.out.println("backward");

		} else if (gear == 'N') {
			System.out.println("neutral");
		} else if (gear == 'D') {
			System.out.println("driving");
		} else {
			System.out.println("invaild character" + gear);
		}
	}

	public void move() {
		accelerete();
	}
}

interface Vehicle {

	void move();
}
