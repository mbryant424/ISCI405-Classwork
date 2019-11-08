package Classwork;

class A {
	int f = 0;
	
	public String toString() {
		return "" + f();
	}
	int f() {
		return f;
	}
	
}

class B extends A {
	// can introduce another variable of the same name, being in a different class
	// int f;
	int f;
	// Constructor
	B() {
		// default constructor is called, which is the constructor of A
		// super();
		f = 1; //points to f in the same class, not super class
	}
	int f() {
		return f;
	}
}

class C extends A {
	//Constructor as well, don't need to write C()
	{
		f = 2;
	}
}

class D extends B /*, C */{
	//Default Constructor if nothing written
	D() {
		super();
	}
}

public class DiamondProblem {
	public static void main(String[] args) {
		System.out.println(new D());
	}
}
