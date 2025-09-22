class Demo
{
	public static void main(String[] args)
	{
		
		try
		{
			//int a=19/0;
			throw new ArithmeticException("divided by zero");
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("always execute");
			
		}
		
		
	}
	
}