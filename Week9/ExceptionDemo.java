class ExceptionDemo
{
	public static void main(String args[]) throws Exception//not needed as we are handling the checked exception  ("Exception" is also a ckecked exception")
	{
		   try
		   {
			throw new Exception("explicit exception is thrown");
		   }
		   catch(Exception e)
		   {
		 	System.out.println(e.getMessage());
		   }
		   finally
		   {
			System.out.println("this is a finally clause");
		   }
	}
}