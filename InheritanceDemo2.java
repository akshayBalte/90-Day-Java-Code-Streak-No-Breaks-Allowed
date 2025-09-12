
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




class InheritanceDemo2
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
		
		
		
		// child class refernece and object of parenet class
		
		Child c1= (Child)new Parent();
		c1.m1();
		c1.m2();
		
		Parent p1=new Child();
		p1.m1();
		p2.m2();
	}
}