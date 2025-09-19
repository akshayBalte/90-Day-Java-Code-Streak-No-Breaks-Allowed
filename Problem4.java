class Problem4
{
	static void fibonacciSeries(int a,int b,int n)
	{
		if(n==0)
			return ;
		else
		{
			int c=a+b;
			System.out.print(","+c);
			 fibonacciSeries(b,c,n-1);
			 
		}
	}
	public static void main(String[] args)
	{
		/*
		int a=0;
		int b =1;
		int n=8;
		System.out.print(a+","+b);
		for(int i=2;i<n;i++)
		{
			int c=a+b;
			System.out.print(","+c);
			a=b;
			b=c;
		}
	
		*/
		int a=0;
		int b =1;
		int n=8;
		
		System.out.print(a+","+b);
		fibonacciSeries(a,b,n-2);
		
	}
	
}