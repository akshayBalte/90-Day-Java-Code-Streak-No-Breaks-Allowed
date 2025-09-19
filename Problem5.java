class Problem5
{
	public static int GCD(int num1,int num2,int min)
	{
		if(min==1)
			return 1;
		else
		{
			if(num1%min==0&&num2%min==0)
			{
				return min;
			}
			return  GCD(num1,num2,min-1);
			
		}
		
	}
	public static void main(String[] args)
	{
		/*
		int number1=17;
		int number2=23;
		int gcd=1;
		//int min=54<24?54:24;
		int min=Math.min(number1,number2);
		//System.out.println(max);
		for(int i=1;i<min;i++)
		{
			if(number1%i==0&&number2%i==0)
				gcd=i;
		}
		System.out.println("GCD of two number "+number1+" and "+number2 +" is : " +gcd);
		*/
		int number1=54;
		int number2=24;
		int min=Math.min(54,24);

		int gcd=GCD(number1,number2,min);
		System.out.println("GCD of two number "+number1+" and "+number2 +" is : " +gcd);

	}
	
}
