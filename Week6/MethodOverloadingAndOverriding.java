class Arithmetic
{
	int add(int a,int b)
	{
		return 0;
	}
}

class Addition extends Arithmetic
{
	int add(int a, int b)//override
	{
		return a+b;
	}

	int add(int a, int b, int c)//overload
	{
		return a+b+c;
	}
}

class MethodOverloadingAndOverriding
{
	public static void main(String[] args)
	{
		Addition a=new Addition();
		System.out.println(a.add(10,20,30));
		System.out.println(a.add(10,20));
	}
}