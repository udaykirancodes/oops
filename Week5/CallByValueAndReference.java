class AnInteger
{
	int i;
	AnInteger(int i)
	{
		this.i=i;
	}
}

class CallByValueAndReference
{
	public static void main(String[] args)
	{
		AnInteger num=new AnInteger(50);

		System.out.println("calling by value");
		System.out.println("before call, i is : "+num.i);
		callByValueChange(num.i);
		System.out.println("after call, i is : "+num.i+"\n");

		System.out.println("calling by reference");
		System.out.println("before call, i is : "+num.i);
		callByReferenceChange(num);
		System.out.println("after call, i is : "+num.i);	
	}

	static void callByValueChange(int i)
	{
		i=i+100;
	}
	static void callByReferenceChange(AnInteger num)
	{
		num.i=num.i+100;
	}
}