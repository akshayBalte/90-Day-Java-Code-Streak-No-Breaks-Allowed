class Problem2
{
	
	static boolean isPrime(int number,int i)
	{
		if(i==1)
			return true;
		else
		{
			if(number%i==0)
				return false;
			
			 return isPrime(number,i-1);
		}
		
	}

	
	public static void main(String[] args)
	{
	/*	
		int number=15;
		boolean isPrime=false;
		
		for(int i=2;i<=(number/2);i++)
		{
			if(number%i==0)
			{
				isPrime=true;
				break;
			}
			
		}
		
		if(!isPrime)
			System.out.println(number+" is prime");
		else
			System.out.println(number+" is not prime");
		
		
	*/
	
		int number=15;
		 boolean checkPrime=isPrime(number,number/2+1);
		if(checkPrime)
			System.out.println(number+" is prime");
		else
			System.out.println(number+" is not prime");
	}
}