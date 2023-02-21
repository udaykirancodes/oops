class MultiCatchRule
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		try
		{
			a[5]=5;
		}
		catch(Exception e)
		{
			System.out.println("in the catch block of Exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("in the catch block of ArrayIndexOutOfBoundsException");
		}
	}
}