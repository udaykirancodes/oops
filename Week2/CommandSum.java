class CommandLineSum{
	public static void main(String args[])
    {
    	int sum=0;
        for(int i=0;i<args.length;i++)//just array.length for arrays, while for strings string.length();
			sum=sum+Integer.parseInt(args[i]);
		System.out.println("sum = "+sum);
	}
}