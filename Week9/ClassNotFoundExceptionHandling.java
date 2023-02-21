//trying to load a class named "Student" which is not in the CLASSPATH (i.e., nor in the \bin directory neither in the current working directory)

class ClassNotFoundExceptionHandling
{
	public static void main(String args[]) throws ClassNotFoundException
	{
		try
		{
			Class c=Class.forName("Student");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
			System.out.println("class cannot be found or was removed from the CLASSPATH");
		}
	}
}