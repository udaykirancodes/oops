import java.util.Scanner;

class Object
{
	static int c=0;
	Object()
	{
		c++;
	}

	static void m()
	{
		System.out.println("a static method example");
	}
}

class ExampleForStatic
{
	public static void main(String[] args)
	{
		Object o1=new Object();
		Object o2=new Object();
		Object o3=new Object();
		Object o4=new Object();
		System.out.println("objects created are "+Object.c+"\n");// we can write o1.c or o2.c and so on
		//Example for static methoc
		Object.m();
	}
}