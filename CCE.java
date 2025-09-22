class A{}
class B extends A{}

class CCE
{
	public static void main(String[] args)
	{
		
		A a=new A();
		try{
			
			int i=10/0;
			B b=(B)a;
			System.out.println(" completedd downcasting");
			
			
		}
		catch(ClassCastException e)
		{
			System.out.println(e);
		}
		catch( ArithmeticException e)
		{
			//e.printStackTrace();
			e.getMessage();
			//e.getCause();
		}
		finally
		{
			System.out.println("found Class cast exception");
			
		}
		
	}
}