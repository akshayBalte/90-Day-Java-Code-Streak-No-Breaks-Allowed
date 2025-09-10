abstract class Shape{
	// we add abstract method so we have to make class abstrcat
	String color;
	Shape(String color){
		this.color=color;
	}
	
	abstract double area(); //abstact method
	
	void display()
	{
		System.out.println("inside the abstract class");
	}
	
	
	
}


class Circle extends Shape{

		@Override
		double area()
		{
			System.out.println("we inside circle class thorugh abstract class shape");
			return 5.5;
		}
		
}


class AbstractDemo
{
	public static void main(String[] args)
	{
		Circle c=new Circle();
		System.out.println(c.area());
		//Square s=new Square();
		//System.out.println(s.area());
		
	}
	
}