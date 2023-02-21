/* an example where "this" can be used to call/invoke the constructor of current class*/
//also to avoid instance variable hiding

import java.util.Scanner;

class Object
{
	int i;
	Object()
	{
		this(10);
	}
	Object(int i)
	{
		this.i=i;
	}
}

class ExampleForThis
{
	public static void main(String[] args)
	{
		Object o=new Object();
		System.out.println("i = "+o.i);
		Object o1=new Object(100);
		System.out.println("i = "+o1.i);
	}
}
//call to the current class constructor can be made only from constructors  (can't from method)
