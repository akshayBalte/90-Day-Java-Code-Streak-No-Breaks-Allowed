class DemoString
{
	
	public static void main(String... args)
	{
		
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
				String s4=new String("hello");
				String s5=new String("hello").intern();
						String s6=s3.intern();
						String s7="hel"+"lo";
						
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println("=============================");
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1==s3);
		System.out.println(s4==s5);
		System.out.println(s1==s5);
		System.out.println(s6==s4);
		System.out.println(s6==s1);
				System.out.println(s7==s1);
						System.out.println(s7==s3);


		
		
		


		
	}
}