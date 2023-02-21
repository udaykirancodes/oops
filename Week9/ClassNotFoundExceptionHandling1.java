//trying to load a class named "Student" which is not in the CLASSPATH (i.e., nor in the \bin directory neither in the current working directory)

class ClassNotFoundExceptionHandling1
{
	public static void main(String args[]) throws ClassNotFoundException
	{
		try
		{
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
			System.out.println("class cannot be found or was removed from the CLASSPATH");
		}
	}
}