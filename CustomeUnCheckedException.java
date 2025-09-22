
class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}




class CustomeUnCheckedException

{
	public static void validateAge(int age) throws InvalidAgeException
	{
		
		if(age<18)
			throw new InvalidAgeException("age must be above 18");
		else
			System.out.println("Age is above 18");
		
	}
	
	public static void main(String[] args)
	{
		
		try
		{
			//validateAge(19);
		   validateAge(17);

			
			
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
}
