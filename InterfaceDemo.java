import java.lang.*;
interface  Shape{
	
	 double calculateArea(); //abstarct method
	
	
	
	
	
}


class Circle implements Shape{
	
	double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	
	@Override
	public double calculateArea()
	{
		return (2*3.13*radius*radius);
	}
	
		
		
}


class InterfaceDemo
{
	public static void main(String[] args)
	{
		Circle c=new Circle(112.0); 
		//Shape c=new Circle(10.0);
		//Shape s1=new Shape(12.2) //error
		System.out.println(c.calculateArea());
		//Square s=new Square();
		//System.out.println(s.area());
		
	}
	
}