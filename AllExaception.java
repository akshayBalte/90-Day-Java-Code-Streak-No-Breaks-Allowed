class AllExaception
{
	public static void main(String[] args)
	{
		
		
		System.out.println("1: start");
		String arr[] = {"12","abc"};
		
		try{
			String s1 = arr[0];//str
			String s2 = arr[1];//str: ArrayIndexOutOfBound Exception
			
			int i = Integer.parseInt(s1);//12
			int j = Integer.parseInt(s2);//2 : NumberFormatException
			int k = i/j;//throws Arithmetic Exception
			System.out.println(k);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		
		
		
	}
}
