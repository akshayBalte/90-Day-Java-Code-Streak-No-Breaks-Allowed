class Age

{
	static void chackAge(int age)
	{
		if(age<18)
			throw new RuntimeException("ages is less");
		else
			System.out.println("agge is above 19");
		
	}
	
	
	public static void main(String[] args)
	{
		
		chackAge(16);
	}
	
}