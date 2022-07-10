package oops.inheritance;

public class InheritanceDemo {
	public static void main(String[] args) {
		System.out.println("welcome to Inheritance demo");
		P p = new P();
		// p.methodA();
		// p.methodP();
		/*
		 * A a=new A();// cannot create the object of interface class becauce method do
		 * not have body or defination a.methodA();
		 */
		A a = new P();// P is a sub class of A
		// a.methodA();
		// a.methodP();//a is reference of type A, but methodP is declared and defined
		// in type P
		/*
		 * Q q = new Q();//class Q is abstract hence we cannot create its object
		 * q.methodB(); q.methodA();
		 */
		R r = new R();
		r.methodA();
		r.methodB();
	}
}

//interfaces can have only public abstract method and static constant variables	 
interface A {
	public abstract void methodA();// all interface method are by default public and abstract
}

interface B extends A {
	void methodB();
	
}

/*
 * interface C implements A { interface cannot implement another interface but
 * can extend another interface }
 */
class P implements A {
	// concrete class cannot have abstract method
	public void methodA() {
		System.out.println("method A in class P");
	}

	public void methodP() {
		System.out.println("method P in class P");
	}
}

//class Q implements B but B extends A hence Q inherites method B as well as method A
//class Q needs to implements method B as well As method A but it is implementing only method B
//hence it needs to declared as abstract(method A from interface A is still undefined)
abstract class Q implements B {
	public void methodB() {
		System.out.println("method B in class Q");

	}
}
//R extends Q and Q has one undefined method methodA() 
//to make R a concreate class it must implements methodA()
class R extends Q {
	public void methodA() {
		System.out.println("method A in class R");
	}
}
/* 
inheritance means "is a " relationship
for example
P is a A
B is a A
Q is a B
Q is a A too
R is a Q
R is a B,A too
only P and R are concreate class here
Q is a Abstract class
A and B are interfaces
*/