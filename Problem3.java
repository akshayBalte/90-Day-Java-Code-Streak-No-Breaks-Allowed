class Problem3
{
	public static int calculateFactorial(int num)
	{
		if(num==1||num==0)
			return 1;
		else 
			return num*calculateFactorial(num-1);
		
	}
	public static void main(String[] args)
	{
	/*	
		int number=0;
		if(number==0||number ==1)
			System.out.println("fact is 1");
		if(number<0)
			System.out.println("invalid Number");
		
		int sum=1;
		for(int i=1;i<=number;i++)
		{
			sum=sum*i;
		}
		System.out.println("Factorial of "+number+" is : "+sum);
	*/


		int number=5;
		int fact=calculateFactorial(number);
		System.out.println("Factorial of "+number+" is : "+fact);


	
	}
}