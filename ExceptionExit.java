class ExceptionExit
{
	public static void main(String[] args)
	{

		System.out.println("enter satrt");

		try
		{
						System.out.println("before exist");

			System.out.println("after exist");
			throw new NullPointerException();
							System.exit(0);

			
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		finally
		{
						System.out.println("finally  done");
		}

		
	}
	
}