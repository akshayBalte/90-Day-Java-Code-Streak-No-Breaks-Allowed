class Problem9
{
	public static void main(String[] args)
	{
		int num=121;
		int revrse=0;
		int temp=num;
		
		while(temp>0)
		{
			int reaminder=temp%10;
			revrse=revrse*10+reaminder;
			temp/=10;
			
		}
		if(revrse==num)
			System.out.println(num +" is palidrome number");
		else
			System.out.println(num +" is not palidrome number");
	
		
		
	}
	
}