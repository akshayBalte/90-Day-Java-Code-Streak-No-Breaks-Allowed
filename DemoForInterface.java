
interface Bank
{
	void rateOfInterest();
}

class Sbi implements Bank{
	public void rateOfInterest()
	{
		System.out.println("rate of inteest in sbi :4.0%");
	}
}
class Boi implements Bank{
public void rateOfInterest()
	{
		System.out.println("rate of inteest in boi :4.2%");
	}

}
class Bob implements Bank{

public void rateOfInterest()
	{
		System.out.println("rate of inteest in bob :4.5%");
	}
}	


class DemoForInterface
{
	public static void main(String[] args)
	{
		Sbi s1=new Sbi();
		Boi b1=new Boi();
		Bob b2=new Bob();
		
		s1.rateOfInterest();
		b1.rateOfInterest();
		b2.rateOfInterest();
		
		//Sbi s2=new Bank(); // error we can not create object of abstrct class or interface
		//means we cannot initiseted
		Bank s2=new Sbi();
		s2.rateOfInterest();
}
}