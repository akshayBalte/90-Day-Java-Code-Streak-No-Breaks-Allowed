
class Parent
{
	int x=20;
	
	void displayParent()
	{
		System.out.println("Parent class"+ " x value " +x);
	}
}
class Child extends Parent
{
	int c=50;
	
	void displayChild()
	{
		System.out.println("child class"+" value of c"+c);
	}
}




class Inheritance
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.displayChild();
		c.displayParent();
		
	}
}