
class Parent
{
	int x=20;
	
	void displayParent()
	{
		System.out.println("Parent class"+ " x value " +x);
	}
	void m1()
	{
		System.out.println("Parent m1 method");
	}
}
class Child extends Parent
{
	int c=50;
	
	void displayChild()
	{
		System.out.println("child class"+" value of c "+c);
	}
	
		void m2()
	{
		System.out.println("child m2 method");
	}

}




class InheritanceDemo
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.displayChild();
		c.displayParent();
		c.m2();
		
		c.m1();
		
		
		
		
		Parent p=new Parent();
		p.displayParent();
		p.m1();
		//System.out.println("value accesing "+p.x);
		//p.displayChild();//error 
		
	}
}