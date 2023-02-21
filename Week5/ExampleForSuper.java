//super can be used to refer immediate parent class instance variable.
//super can be used to invoke immediate parent class method.
//super() can be used to invoke immediate parent class constructor.

class ParentClass {
	int i;

	ParentClass(int i) {
		this.i = i;
	}
}

class ChildClass extends ParentClass {
	int i = 10;

	ChildClass(int i) {
		super(100); // once we provide a compiler doesn't provide default constructor, so here
					// super() raises error
		this.i = i;
	}

	void display() {
		System.out.println("i in Child class object : " + i);
		System.out.println("i in Parent class object: " + super.i);
		// here parent class i is available in child class but here these two have same
		// names
		// so to refer to the parent class i we used super.i
		// even if we don't have same names, we can still use super.varaiblename (but
		// not neede as it will be inherited)

		// ----------------------------------------
		// this.a(); //method must be from a method
	}
	/*
	 * static void a()
	 * {
	 * System.out.println("just a test");
	 * //so using this we can call static methods also, because this refers to
	 * current object and we can static methods using objects also
	 * }
	 */
}

class ExampleForSuper {
	public static void main(String[] args) {
		ChildClass c = new ChildClass(1000);
		c.display();
	}
}