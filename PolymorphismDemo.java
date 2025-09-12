class A
{
	void show()
	{
		System.out.println("inside in class A");
	}
}

class B extends A
{
	void show()
	{
		System.out.println("inside in class B");
	}
	
}


class PolymorphismDemo
{
	public static void main(String[] args)
	{
		A a=new A();
		a.show();
		B b=new B();
		b.show();
		
	}
	
	
}

		