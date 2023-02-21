class MyException extends Exception
{
	String message;
	MyException(String s)
	{
		message=s;
	}

	String getExceptionMessage()
	{
		return message;
	}
}

class CustomException
{
	public static void main(String args[]) throws MyException
	{
		try
		{
			throw new MyException("It's a CustomException");
		}
		catch(MyException e)
		{
			System.out.println(e.getExceptionMessage());
		}
	}
}