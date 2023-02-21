class StackTrace
{
	static void one() throws Exception
	{
		try
		{
			two();
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	static void two() throws Exception
	{
		throw new Exception("Explicit Exception");
	}

	public static void main(String args[])
	{
		try
		{
			one();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}