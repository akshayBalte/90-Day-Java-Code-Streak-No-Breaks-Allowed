

class A
{
	void m1()
	{
		System.out.println("m1 called");
	}
}
class NPE
{
	public static void main(String[] args)
	{
		
		A a=null;
		try
		{
			
			a.m1();
		}
		catch( NullPointerException e)
		{
			System.out.println("==================");
			e.printStackTrace();
		}
		
	}
}
		
		