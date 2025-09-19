class Problem6
{
	public static int squartRoot(int num,int i)
	{
		if(i*i>num)
			return i-1;
		else
			return squartRoot(num,i+1);
		
		
	}
	public static void main(String[] args)
	{
	/*	
		int number=16;
		
		int i=0;
		while(i*i<=number)
		{
			i++;
		}
		int squartRoot=i-1;
		System.out.println("squartRoot of "+number+" is Approximately : "+squartRoot);
	*/	
		int number=481;
		System.out.println("squartRoot of "+number+" is Approximately : "+squartRoot(number,0));

	}
}