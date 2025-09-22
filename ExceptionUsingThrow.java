class ExceptionUsingThrow
{
	public static void main(String[] args)
	{
		
		try{
			int arr[] = {1,2,3,4,5};
	
	
	
	        System.out.println("stop");
			throw new ArrayIndexOutOfBoundsException();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	
	}
}
