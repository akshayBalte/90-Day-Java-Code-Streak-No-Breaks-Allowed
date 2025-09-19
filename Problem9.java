class Problem9
{
	public static int checkPalidrome(int temp,int rev)
	{
		if(temp==0)
		{
			return 0;
		}
		else
		{
			
			int reaminder=temp%10;
			rev=rev*10+reaminder;
			return checkPalidrome(temp/10,rev);
		}
		
	}
	
	
	public static void main(String[] args)
	{
		int num=121;
		
		int reverse=checkPalidrome(num,0);
		/*
		int revrse=0;
		int temp=num;
		
		while(temp>0)
		{
			int reaminder=temp%10;
			revrse=revrse*10+reaminder;
			temp/=10;
			
		}
		*/
		if(reverse==num)
			System.out.println(num +" is palidrome number");
		else
			System.out.println(num +" is not palidrome number");
	
		
		
	}
	
}