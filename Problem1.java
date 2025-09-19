class Problem1
{
	static int countDigit(int n)
	{
		if(n==0)
			return 0 ;
		else
		{
			n=n/10;
			return 1+countDigit(n);
		}
		
	}
	
	static int power(int base,int expo,int t)
	{
		if(expo==0)
			return t;
		else
		{
			t=t*base;
			expo--;
			
			return power(base,expo ,t);
		}
		
	}
	
	static int amstrong(int number,int count,int total)
	{
		if(number==0)
			return total;
		else
		{
			int reaminder=number%10;
			total=total+power(reaminder,count ,1);
			number=number/10;
			return amstrong(number,count,total);
			
		}
		
		
	}
	public static void main(String[] args)
	{
	/*	int number=153;
		
		int count=0;
		int temp=number;
		while(temp>0)
		{
			count++;
			temp/=10;
		}
		
		System.out.println("count: "+ count);
		
		temp=number;
		int AmstrongNumber=0;
		while(temp>0)
		{
			int reaminder=temp%10;
			int sum=1;
			for(int i=1;i<=count;i++)
			{
				sum=reaminder*sum;
			}
			AmstrongNumber=AmstrongNumber+sum;
			temp/=10;	
		}
		if(number==AmstrongNumber)
			System.out.println(number+" = "+AmstrongNumber+" number is amstrong number");
		else
			System.out.println(number+" = "+AmstrongNumber+" number is not amstrong number");
		
		
	*/	
		System.out.println("Using recusrion ");
		int num=153;
		int count=countDigit(num );
		System.out.println(count);
		int check=amstrong(num,count,0);
		if(num==check)
			System.out.println(num+" = "+check+" number is amstrong number");
		else
			System.out.println(num+" = "+check+" number is not amstrong number");
		
	}
}